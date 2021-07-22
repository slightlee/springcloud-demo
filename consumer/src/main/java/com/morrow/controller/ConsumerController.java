package com.morrow.controller;

import com.morrow.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ProviderClient providerClient;

    @GetMapping("/feignProvider")
    public String feignProvider() {
        return providerClient.feignProvider("test feign");
    }


}
