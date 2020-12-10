// package com.ms.learning.netty.springboot.controller;
//
// /**
//  * @description: TODO
//  * @author: sam
//  * @date: 2020/12/10 11:21
//  * @version: v1.0
//  */
//
// import com.ms.learning.netty.springboot.common.annotation.MethodLogPrint;
// import com.ms.learning.netty.springboot.common.domain.ResponseResult;
// import com.ms.learning.netty.springboot.utils.NettyClientUtil;
// import lombok.extern.slf4j.Slf4j;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
//
// /**
//  * 客户端处理器
//  **/
// @RestController
// @Slf4j
// public class UserController {
//
//     @PostMapping("/helloNetty")
//     @MethodLogPrint
//     public ResponseResult helloNetty(@RequestParam String msg) {
//         return NettyClientUtil.helloNetty(msg);
//     }
// }
