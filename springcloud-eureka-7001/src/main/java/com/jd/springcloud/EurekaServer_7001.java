package com.jd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * TODO
 * Eureka：服务器的启动类，可以接受别人注入进来
 * @author 13540
 * @version 1.0
 * @date 2021-05-12 22:56
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class, args);
    }
}
