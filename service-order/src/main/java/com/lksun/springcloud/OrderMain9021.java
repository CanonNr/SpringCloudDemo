package com.lksun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderMain9021 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain9021.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRT(){
        RestTemplate restTemplate = new RestTemplate();
        // 防止中文返回乱码
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        return restTemplate;
    }
}
