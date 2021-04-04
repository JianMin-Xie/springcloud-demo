package com.xjm.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Panda
 * @create 2021-04-03 18:24
 */
@Configuration
public class ConfigBean {

    @LoadBalanced //配置负载均衡实现RestTemplate
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * IRule:
     * RoundRobinRule 轮询策略
     * RandomRule 随机策略
     * AvailabilityFilteringRule ： 会先过滤掉，跳闸，访问故障的服务~，对剩下的进行轮询~
     * RetryRule ： 会先按照轮询获取服务~，如果服务获取失败，则会在指定的时间内进行，重试
     */
//    @Bean
//    public IRule myRule() {
//        return new RandomRule();//使用随机策略
//        //return new RoundRobinRule();//使用轮询策略
//        //return new AvailabilityFilteringRule();//使用轮询策略
//        //return new RetryRule();//使用轮询策略
//    }

}
