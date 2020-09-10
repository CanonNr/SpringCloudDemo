package com.lksun.springcloud.remoteservice;

import org.springframework.stereotype.Component;

@Component
public class UserBack implements UserClient {
    @Override
    public String get(Integer id) {
        return "Error 1014";
    }
}
