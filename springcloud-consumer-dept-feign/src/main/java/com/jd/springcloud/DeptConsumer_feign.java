package com.jd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-10 17:38
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.jd.springcloud"})
public class DeptConsumer_feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_feign.class, args);
    }

}
