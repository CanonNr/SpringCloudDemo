package com.lksun.springcloud.controller;

import com.lksun.springcloud.entities.CommonResult;
import com.lksun.springcloud.service.GetUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    public String port;

    @RequestMapping("/user")
    public CommonResult get(@RequestParam(value = "id",defaultValue="1") Integer id){
        GetUser user = new GetUser();
        return new CommonResult(200,this.port,user.getUserById(id));
    }
}
