package com.devstack.department_service.controlller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

    @Value("${spring.boot.messages}")
    private String message;

    @GetMapping("message")
    public String message(){
        return message;
    }
}
