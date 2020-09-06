package com.lksun.springcloud.remoteservice;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user")
public interface UserClient {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    String get(@Param(value = "id") String id);
}
