package com.jd.springcloud.dao;

import com.jd.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-10 13:35
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept queryById(Integer id);

    public List<Dept> queryAll();
}
