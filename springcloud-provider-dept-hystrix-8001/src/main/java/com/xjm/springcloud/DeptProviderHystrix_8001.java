package com.xjm.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author Panda
 * @create 2021-04-03 7:01
 */
@SpringBootApplication
@EnableEurekaClient//开启Eureka客户端注解，在服务启动后自动向注册中心注册服务
@EnableDiscoveryClient
@EnableCircuitBreaker // 添加对熔断的支持注解
public class DeptProviderHystrix_8001 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix_8001.class,args);
    }

    //增加一个 Servlet
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        //访问该页面就是监控页面
        registrationBean.addUrlMappings("/actuator/hystrix.stream");

        return registrationBean;
    }
}
