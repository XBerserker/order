package com.imooc.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lt on 2018/10/1.
 */
@Component
public class RestTemplateConfig {
    @Bean
    @LoadBalanced
    public static RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
