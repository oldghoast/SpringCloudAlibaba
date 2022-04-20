package com.java.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName RibbonRadomRuleConfig
 * @Description SpringCloudAlibaba
 * @Author oldghoast
 * @Date 2022/4/20 22:29
 * @Version 1.0
 */
@Configuration
public class RibbonRandomRuleConfig {

    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
