package com.lksun.springcloud.controller;

import com.lksun.springcloud.service.GetUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.lksun.springcloud.entities.CommonResult;

@RestController
public class TestController {
    @Value("${server.port}")
    public String port;
    @Value("${data.title}")
    public String title;

    @RequestMapping("/user")
    public CommonResult get(Integer id) throws InterruptedException {
        GetUser user = new GetUser();
        return new CommonResult(200,this.port,user.getUserById(id));
    }

    @RequestMapping("/title")
    public CommonResult title(Integer id){
        return new CommonResult(200,this.port,title);
    }
}
