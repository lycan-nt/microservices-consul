package com.owl.departmentservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "usuario-service")
public interface UserServiceClient {

    @GetMapping("/user/getUsersByDeptId")
    public ResponseEntity<String> getUsersByDeptId(@RequestParam String deptId);
}