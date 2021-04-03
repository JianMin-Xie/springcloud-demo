package com.xjm.springcloud.service;

import com.xjm.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author Panda
 * @create 2021-04-03 6:55
 */
public interface DeptService {


    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();

}
