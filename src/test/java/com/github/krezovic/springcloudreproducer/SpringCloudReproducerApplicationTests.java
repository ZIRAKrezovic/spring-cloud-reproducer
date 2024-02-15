package com.github.krezovic.springcloudreproducer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class SpringCloudReproducerApplicationTests {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    void example() {
        ResponseEntity<String> response = Assertions.assertDoesNotThrow(() -> restTemplate.getForEntity("http://myself/test", String.class));
        Assertions.assertEquals("Hello", response.getBody());
    }
}
