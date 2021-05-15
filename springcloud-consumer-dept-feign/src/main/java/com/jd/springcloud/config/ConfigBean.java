package com.jd.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-10 17:14
 */
@Configuration //=> Spring applicationContext.xml
public class ConfigBean {

    // 配置负载均衡实现RestTemplate
    // IRule
    // RoundRobinRule 轮询
    // RandomRule 随机
    // AvailabilityFilteringRule 会先过滤掉，跳闸，访问故障的服务，对剩下的进行轮询
    // RetryRule 会先按照轮询获取服务，如果服务获取失败，则会在指定的时间内进行重试
    @Bean
    @LoadBalanced //ribbon 配置负载均衡实现restTemplate
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
