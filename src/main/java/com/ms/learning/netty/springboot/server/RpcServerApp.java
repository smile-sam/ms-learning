package com.ms.learning.netty.springboot.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 启动类
 *
 */
@EnableAsync//注意这里，这个注解启用了线程池
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RpcServerApp extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RpcServerApp.class);
    }

    /**
     * 项目的启动方法
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(RpcServerApp.class, args);
        //开启Netty服务
        NettyServer nettyServer =new  NettyServer ();
        nettyServer.start();
        log.info("======服务已经启动========");
    }
}
