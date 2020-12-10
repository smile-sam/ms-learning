package com.ms.learning.netty.springboot.client.controller;

import com.ms.learning.netty.springboot.client.config.NettyClientUtil;
import com.ms.learning.netty.springboot.common.annotation.MethodLogPrint;
import com.ms.learning.netty.springboot.common.domain.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @PostMapping("/helloNetty")
    @MethodLogPrint
    public ResponseResult helloNetty(@RequestParam String msg) {
        return NettyClientUtil.helloNetty(msg);
    }

}
