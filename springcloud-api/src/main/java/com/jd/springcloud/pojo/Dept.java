package com.jd.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true) //链式写法
/*
 * 链式写法
 * Dept dept = new Dept();
 * dept.setDeptId(11).setDeptName("lin")
 */
//所有实体类务必实现序列化
public class Dept implements Serializable {
    private Integer deptId;    // 主键
    private String deptName;   // 部门名称
    private String dbSource;   // 这个数据存在哪个数据库的字段~微服务，一个微服务对应一个数据库，同一个信息可能存在不同的数据库

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}
