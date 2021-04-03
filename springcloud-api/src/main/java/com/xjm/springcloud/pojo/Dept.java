package com.xjm.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Panda
 * @create 2021-04-03 6:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)//支持链式写法
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    //哪个数据库
    private String db_source;

    /**
     * 链式写法：
     *      dept.setDeptNo(1).setDname("sss").setDb_source("DB01")
     */
}
