package com.jd.springcloud.dao;

import com.jd.springcloud.pojo.Dept;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DeptDaoTest extends TestCase {
    @Autowired
    DeptDao deptDao;

    @Test
    public void test() {
        Dept dept = new Dept("服务部");
        deptDao.addDept(dept);
    }
}