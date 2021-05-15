package com.jd.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author 13540
 * @version 1.0
 * @date 2021-05-15 7:47
 */
@Configuration
public class JDRule {
    @Bean
    public IRule myRule() {
        return new JDRandomRule();
    }
}
