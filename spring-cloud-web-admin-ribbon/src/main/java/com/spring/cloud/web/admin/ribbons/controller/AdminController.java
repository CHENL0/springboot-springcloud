package com.spring.cloud.web.admin.ribbons.controller;

import com.spring.cloud.web.admin.ribbons.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chen
 * @createTime 20181223 20:16
 * @description non
 */
@RestController
public class AdminController {
    @Autowired
    private AdminServices adminService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String message) {
        return adminService.sayHi(message);
    }
}
