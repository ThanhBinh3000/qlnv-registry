package com.tcdt.qlnvregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QlnvRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(QlnvRegistryApplication.class, args);
    }

}

