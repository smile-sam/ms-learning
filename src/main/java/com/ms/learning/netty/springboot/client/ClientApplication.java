package com.ms.learning.netty.springboot.client;



import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**启动类
 * @description: TODO
 * @author: sam
 * @date: 2020/12/10 13:52
 * @version: v1.0
 */
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = "com.*")
public class ClientApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ClientApplication.class);
    }

    /**
     * 项目的启动方法
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
        log.info("======服务已经启动========");
    }
}
