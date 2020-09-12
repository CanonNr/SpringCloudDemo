package com.lksun.springcloud;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminMain {
    public static void main(String[] args) {
        SpringApplication.run(AdminMain.class,args);
    }
}
