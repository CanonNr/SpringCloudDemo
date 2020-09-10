package com.lksun.springcloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {
//    @Autowired
//    private EurekaClient eurekaClient;
//
//    @RequestMapping("/")
//    public Object getServerInfo() {
//        // 通过eurekaClient访问服务器获取某个命名的集群。
//        // getNextServerFromEureka的第一个参数是服务器名称，可重复
//        // 因为获得的是下一个,所以是负载均衡的
//        InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka("eureka-client-9020", false);
//        System.out.println("name:" + nextServerFromEureka.getAppName() + " port:" + nextServerFromEureka.getPort());
//        return nextServerFromEureka;
//    }
}
