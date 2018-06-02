package com.dimaz.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ClientConfig {

    @Value("${my.message:This is default message}")
    private String message;
    
    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}
