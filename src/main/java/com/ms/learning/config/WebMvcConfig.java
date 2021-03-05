// package com.ms.learning.config;
//
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.ViewResolver;
// import org.springframework.web.servlet.config.annotation.*;
// import org.springframework.web.servlet.view.InternalResourceView;
// import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
// /**
//  * @description: TODO
//  * @author: sam
//  * @date: 2021/1/6 15:07
//  * @version: v1.0
//  */
// @Configuration
// @EnableWebMvc
// public class WebMvcConfig  implements WebMvcConfigurer {
//
//     @Bean
//     public ViewResolver getViewResolver() {
//         InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//         resolver.setPrefix("/WEB-INF/");
//         resolver.setSuffix(".html");
//         return resolver;
//     }
//
//     @Override
//     public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//         configurer.enable();
//     }
//
//     @Override
//     public void addResourceHandlers(ResourceHandlerRegistry registry) {
//         registry.addResourceHandler("/**")
//                 .addResourceLocations("classpath:/META-INF/resources/")
//                 .addResourceLocations("classpath:/resources/")
//                 .addResourceLocations("classpath:/static/")
//                 .addResourceLocations("classpath:/public/");
//     }
// }
