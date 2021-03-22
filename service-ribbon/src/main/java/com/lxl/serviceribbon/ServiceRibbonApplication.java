package com.lxl.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//向服务中心注册
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

//http://localhost:8764/hi?name=forezp 访问多次浏览器交替显示多个地址，说明当我们调用restTemplate.getForObject(“http://SERVICE-HI/hi?name=”+name,String.class)方法时，
// 已经做了负载均衡，访问了不同的端口的服务实例。
//    一个服务注册中心，eureka server,端口为8761
//service-hi工程跑了两个实例，端口分别为8762,8763，分别向服务注册中心注册
//sercvice-ribbon端口为8764,向服务注册中心注册
//当sercvice-ribbon通过restTemplate调用service-hi的hi接口时，因为用ribbon进行了负载均衡，会轮流的调用service-hi：8762和8763 两个端口的hi接口；


//   并向程序的ioc注入一个bean：restTemplate
    @Bean
    @LoadBalanced//表明这个restRemplate开启负载均衡的功能
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
