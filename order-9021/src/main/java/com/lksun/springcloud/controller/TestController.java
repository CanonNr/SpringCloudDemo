package com.lksun.springcloud.controller;

import com.lksun.springcloud.remoteservice.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.BiFunction;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserClient client;

    @RequestMapping(value = "1",method = RequestMethod.GET)
    public String test1(){
        return client.get("1");
    }

    @RequestMapping(value = "2",method = RequestMethod.GET)
    public String test2(){
        return client.get("1");
    }
}
