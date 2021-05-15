package com.jd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-15 13:14
 */
@SpringBootApplication
@EnableHystrixDashboard  //开启监控
public class DeptConsumerDashBoard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashBoard_9001.class, args);
    }
}
