package com.spring.cloud.web.admin.feigns.service;

import com.spring.cloud.web.admin.feigns.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chen
 * @createTime 1123 22:42
 * @description 1
 */
@FeignClient(value = "spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);
}
