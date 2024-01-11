package com.github.krezovic.springcloudreproducer;

import org.springframework.cloud.client.loadbalancer.RestTemplateCustomizer;
import org.springframework.web.client.RestTemplate;

public class ProjectRestTemplateCustomizer implements RestTemplateCustomizer {
    @Override
    public void customize(RestTemplate restTemplate) {

    }
}
