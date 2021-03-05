package com.ms.learning;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// @Slf4j
// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
// public class MsLearningApplication extends SpringBootServletInitializer {
//
//     @Override
//     protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//         return application.sources(MsLearningApplication.class);
//     }
//
//     /**
//      * 项目的启动方法
//      *
//      * @param args
//      */
//     public static void main(String[] args) {
//         SpringApplication.run(MsLearningApplication.class, args);
//         //开启Netty服务
//         NettyServer nettyServer = new NettyServer ();
//         nettyServer.start();
//         log.info("======服务已经启动========");
//     }
// }

@Slf4j
@SpringBootApplication
@EnableTransactionManagement(order = 10)
// @Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
public class MsLearningApplication {
    // AbstractRoutingDataSource abstractRoutingDataSource;
    // AbstractDataSource  abstractDataSource;
    public static void main(String[] args) {
        SpringApplication.run(MsLearningApplication.class, args);
    }

}
