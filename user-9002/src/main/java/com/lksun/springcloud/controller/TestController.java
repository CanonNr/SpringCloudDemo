package com.lksun.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lksun.springcloud.entities.CommonResult;

@RestController
public class TestController {

    @RequestMapping("/test")
    public CommonResult test(){
      return new CommonResult(200,"ok",null);
    }
}
