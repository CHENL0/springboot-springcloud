package com.spring.cloud.web.admin.feigns.service.hystrix;

import com.spring.cloud.web.admin.feigns.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author Chen
 * @createTime 1124 0:03
 * @description 1
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "Hi feigns，your message is :\"" + message + "\" but request error.";
    }
}
