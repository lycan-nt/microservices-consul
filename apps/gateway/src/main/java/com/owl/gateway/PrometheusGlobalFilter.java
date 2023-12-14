package com.owl.gateway;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
public class PrometheusGlobalFilter implements GlobalFilter, Ordered {
    private final MeterRegistry meterRegistry;

    @Autowired
    public PrometheusGlobalFilter(MeterRegistry meterRegistry){
        this.meterRegistry = meterRegistry;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        Counter.builder("gateway.requests.total")
                .description("Total de requisições recebidas")
                .tag("method", exchange.getRequest().getMethodValue())
                .tag("path", exchange.getRequest().getPath().toString())
                .register(this.meterRegistry)
                .increment();

        return chain.filter(exchange)
                .then(Mono.fromRunnable(() -> {
                    if(exchange.getResponse().getRawStatusCode() != null){
                        int statusCode = exchange.getResponse().getRawStatusCode();
                        Counter.builder("gateway.responses.total")
                                .description("The total handled responses")
                                .tag("status", Integer.toString(statusCode))
                                .register(this.meterRegistry)
                                .increment();
                    }
                }));
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
