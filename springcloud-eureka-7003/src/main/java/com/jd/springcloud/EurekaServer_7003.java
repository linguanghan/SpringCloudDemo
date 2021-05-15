package com.jd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-13 22:01
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7003.class, args);
    }
}
