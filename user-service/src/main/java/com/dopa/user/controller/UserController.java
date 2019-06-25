package com.dopa.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanlin
 * @version v1.0
 * @className UserController
 * @description TODO
 * @date 2019-06-25 3:56 PM
 **/
@RestController
public class UserController {
    @Value("${spring.cloud}")
    private String config;

    @GetMapping("/test/config")
    public String test() {
        return config;
    }
}
