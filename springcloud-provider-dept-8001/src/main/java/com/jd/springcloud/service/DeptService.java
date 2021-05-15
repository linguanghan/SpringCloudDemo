package com.jd.springcloud.service;

import com.jd.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-10 14:45
 */

public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Integer id);

    public List<Dept> queryAll();
}
