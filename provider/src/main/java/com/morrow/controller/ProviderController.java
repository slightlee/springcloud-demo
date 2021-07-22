package com.morrow.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Value("${server.port}")
    String port;

    @GetMapping("/testProvider")
    public String testProvider(@RequestParam(value = "name", defaultValue = "morrow",required = false) String name) {
        return "hello " + name + ", i'm provider ,my port:" + port;

    }
}
