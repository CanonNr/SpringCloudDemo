package com.lksun.springcloud.remoteservice;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="user",fallback = UserBack.class)
public interface UserClient {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    String get(@RequestParam(value = "id") Integer id);
}
