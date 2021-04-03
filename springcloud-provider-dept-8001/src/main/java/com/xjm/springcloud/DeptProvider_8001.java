package com.xjm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Panda
 * @create 2021-04-03 7:01
 */
@SpringBootApplication
@EnableEurekaClient//开启Eureka客户端注解，在服务启动后自动向注册中心注册服务
public class DeptProvider_8001 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001.class,args);
    }
}
