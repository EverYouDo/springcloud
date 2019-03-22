package com.guiler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringCloudApplication
@RestController
public class EurekaClientapplication {
    @Value("${server.port}")
    private int port;


    public static void main(String[] args) {
        SpringApplication.run(EurekaClientapplication.class, args);
    }

    @RequestMapping("/index")
    public String index() {
        return "Hello World!,端口：" + port;
    }
}
