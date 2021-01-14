package com.ms.learning.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/14 9:53
 * @version: v1.0
 */
@RestController
public class TestController {

    Object target;
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @GetMapping("test")
    public String test(@RequestParam("name") String name) {
        if(LOGGER.isInfoEnabled()) {
            LOGGER.info("test controller test name : [{}]", name);
        }
        return "测试日志";
    }
}
