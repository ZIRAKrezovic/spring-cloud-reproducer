package com.github.krezovic.springcloudreproducer;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@AutoConfiguration(after = RestTemplateAutoConfiguration.class)
@ConditionalOnBean(RestTemplateBuilder.class)
@ConditionalOnClass({RestTemplateBuilder.class, RestTemplate.class, LoadBalancerClient.class})
public class ProjectRestTemplateAutoConfiguration {
    @Bean
    @LoadBalanced
    public RestTemplate projectRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
