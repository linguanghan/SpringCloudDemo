package com.jd.springcloud.controller;

import com.jd.springcloud.pojo.Dept;
import com.jd.springcloud.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-10 14:48
 */

@RestController
public class DeptController {
    @Autowired
    private DeptServiceImpl deptService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    @GetMapping("/dept/discovery")
    //注册进来的微服务
    public Object discovery() {
        //获得微服务列表的清单
        List<String> service = client.getServices();
        System.out.println("discovery=>service:" + service);

        //得到一个具体的微服务信息
        List<ServiceInstance> instances = client.getInstances("springcloud-provider-dept");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri() + "\t" + instance.getServiceId());
        }

        return this.client;
    }
}
