package com.xjm.springcloud.dao;

import com.xjm.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Panda
 * @create 2021-04-03 6:49
 */

@Mapper
@Repository
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();

}
