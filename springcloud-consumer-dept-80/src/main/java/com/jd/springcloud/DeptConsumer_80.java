package com.jd.springcloud;

import com.jd.myrule.JDRule;
import com.jd.springcloud.pojo.Dept;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-10 17:38
 */
@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就能去加载我们自定义的Ribbon类
@RibbonClient(name = "springcloud-provider-dept", configuration = JDRule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }

}
