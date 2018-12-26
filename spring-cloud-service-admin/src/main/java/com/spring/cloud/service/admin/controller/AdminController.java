package com.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chen
 * @createTime 20181223 15:07
 * @description the controller of amin
 */
@RestController
public class AdminController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "hi")
    public String sayHello(String message){
        return String.format("your message is" + message + "and port:" + port);
    }
}
