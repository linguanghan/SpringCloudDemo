package com.jd.springcloud.controller;

import com.jd.springcloud.pojo.Dept;
import com.jd.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-10 17:06
 */
@RestController
public class DeptConsumerController {
    //理解：消费者，不应该有service层
    //支持RestTemplate ... 供我们直接调用就可以了！注册到Spring中
    @Autowired
    private DeptClientService service;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        return this.service.queryById(id);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return this.service.addDept(dept);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return this.service.queryAll();
    }
}
