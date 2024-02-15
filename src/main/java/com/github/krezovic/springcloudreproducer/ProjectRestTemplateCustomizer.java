package com.github.krezovic.springcloudreproducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.RestTemplateCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@Configuration
public class ProjectRestTemplateCustomizer implements RestTemplateCustomizer {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectRestTemplateCustomizer.class);

    @Override
    public void customize(RestTemplate restTemplate) {
        LOGGER.info("I have customized the Rest Template in a way");
    }
}
