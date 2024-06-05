package com.send_message.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HetchCheckController {

    @GetMapping("")
    public void teste() {

    }

}
