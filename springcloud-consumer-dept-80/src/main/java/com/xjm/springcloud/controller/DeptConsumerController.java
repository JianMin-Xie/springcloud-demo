package com.xjm.springcloud.controller;

import com.xjm.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Panda
 * @create 2021-04-03 18:21
 */

@RestController
public class DeptConsumerController {

    /**
     * 理解：消费者，不应该有service层~
     * RestTemplate .... 供我们直接调用就可以了！ 注册到Spring中
     * (地址：url, 实体：Map ,Class<T> responseType)
     * <p>
     * 提供多种便捷访问远程http服务的方法，简单的Restful服务模板~
     */

    @Autowired
    private RestTemplate restTemplate;

//    private static final String REST_URL_PREFIX="http://localhost:8001";
    //Ribbon:我们这里的地址，应该是一个变量，通过服务名来访问
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

}
