package com.xjm.springcloud.controller;

import com.xjm.springcloud.pojo.Dept;
import com.xjm.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Panda
 * @create 2021-04-03 6:57
 */

//提供restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }


}
