package com.morrow.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider",fallback = ProviderFeignClientCallBack.class)
public interface ProviderClient {

    @GetMapping("/testProvider")
    String feignProvider(@RequestParam(value = "name", defaultValue = "morrow", required = false) String name);
}