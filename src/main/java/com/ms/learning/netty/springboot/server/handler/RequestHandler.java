package com.ms.learning.netty.springboot.server.handler;

import com.ms.learning.netty.springboot.common.domain.Request;
import com.ms.learning.netty.springboot.service.UserService;
import com.ms.learning.netty.springboot.utils.SpringContextUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/10 10:49
 * @version: v1.0
 */
public class RequestHandler extends SimpleChannelInboundHandler<Request> {

    /** 1、注入********************************** */
    /** 此方法注入为空*/
    // @Autowired
    // private UserService userService;
    /** ********************************** */

    /** 2、修改为从上下文中回去********************************** */
    /** 此方法注入为空*/
    private static UserService userService;

    static {
        userService = SpringContextUtil.getBean(UserService.class);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Request request) throws Exception {

    }
    /** ********************************** */
    // ...
}