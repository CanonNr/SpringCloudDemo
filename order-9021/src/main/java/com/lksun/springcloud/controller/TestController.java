package com.lksun.springcloud.controller;

import com.lksun.springcloud.remoteservice.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.function.BiFunction;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserClient client;
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "fg",method = RequestMethod.GET)
    public String test1(@RequestParam(value = "id",defaultValue = "1") Integer id){
        return client.get(id);
    }

    @RequestMapping(value = "rt",method = RequestMethod.GET)
    public String test2(@RequestParam(value = "id",defaultValue = "1") Integer id){
        System.out.println("RestTemplate");
        String url = "http://user/user?id="+id;
        return restTemplate.getForObject(url, String.class);
    }


}
