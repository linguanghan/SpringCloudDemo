package com.jd.springcloud.service;

import com.jd.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-15 10:36
 */
//降级
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryById(Integer id) {
                return new Dept()
                        .setDeptId(id)
                        .setDeptName("id=>"+id+"没有对应的信息：客户端提供了降级的信息，这个服务已经被关闭")
                        .setDbSource("没有数据");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
