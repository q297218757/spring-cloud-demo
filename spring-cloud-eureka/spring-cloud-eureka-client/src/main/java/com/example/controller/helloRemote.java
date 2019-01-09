package com.example.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface helloRemote {
        @RequestMapping(value = "/hello")
        public String hello(@RequestParam(value = "name") String name);

}
