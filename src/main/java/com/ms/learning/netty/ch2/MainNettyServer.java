package com.ms.learning.netty.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/7 15:16
 * @version: v1.0
 */

import io.netty.util.NettyRuntime;
import io.netty.util.internal.SystemPropertyUtil;

/**
 * Netty server 使用main类
 */
public class MainNettyServer {

    /**
     * 端口
     */
    private static int port = 8686;

    public static void main(String[] args) throws Exception {

       int DEFAULT_EVENT_LOOP_THREADS = Math.max(1, SystemPropertyUtil.getInt("io.netty.eventLoopThreads", NettyRuntime.availableProcessors() * 2));

        System.out.println(DEFAULT_EVENT_LOOP_THREADS);
        System.out.println(NettyRuntime.availableProcessors() * 2);
        /**
         * 启动netty服务器
         */
        SayHelloServer sayHelloServer = new SayHelloServer(port);
        sayHelloServer.run();
    }
}