package com.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Chen
 * @createTime 20181223 14:38
 * @description the application of serviceadmin
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class,args);
    }
}
