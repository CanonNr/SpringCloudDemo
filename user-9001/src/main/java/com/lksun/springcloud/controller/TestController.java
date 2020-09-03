package com.lksun.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lksun.springcloud.entities.CommonResult;

@RestController
public class TestController {
    @Value("${server.port}")
    public String port;

    @RequestMapping("/user")
    public CommonResult get(){
        return new CommonResult(200,"请求成功",this.port);
    }
}
