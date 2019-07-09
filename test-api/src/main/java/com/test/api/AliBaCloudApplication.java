package com.test.api;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动类入口
 * @author yingmuhuadao
 * @date 2019/7/8
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class AliBaCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(AliBaCloudApplication.class, args);
    }

    /**
     * 注解用来标识资源是否被限流、降级
     * @return 响应结果
     */
    @GetMapping(value = "/hello")
    @SentinelResource("hello")
    public String hello() {
        return "Hello Sentinel";
    }
}
