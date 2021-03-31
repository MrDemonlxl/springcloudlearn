package com.lxl.sericefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lxl
 */
@EnableDiscoveryClient
@EnableEurekaClient
//开启Feign的功能
@EnableFeignClients
@SpringBootApplication

/**Feign作用：
 * 1. Feign 采用的是基于接口的注解
 * 2.Feign 整合了ribbon，具有负载均衡的能力
 * 3.整合了Hystrix，具有熔断的能力
 * 感觉跟ribbon差不多哈哈哈哈*/
public class SericeFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SericeFeignApplication.class, args);
    }

}
