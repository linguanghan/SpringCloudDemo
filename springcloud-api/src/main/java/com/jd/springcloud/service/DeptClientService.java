package com.jd.springcloud.service;

import com.jd.springcloud.pojo.Dept;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-15 8:58
 */
@Component
@FeignClient(value = "springcloud-provider-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id")Integer id);

    @GetMapping("/dept/list")
    public List<Dept> queryAll();

    @GetMapping("/dept/add")
    public boolean addDept(Dept dept);
}
