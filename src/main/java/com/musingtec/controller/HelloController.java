package com.musingtec.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LSY on 2018/8/29.
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;

    @Value("${server.address}")
    private String ip;


    @GetMapping("/test")
    public String test() {
        return "IP是："+ip+",端口是："+port;
    }
}
