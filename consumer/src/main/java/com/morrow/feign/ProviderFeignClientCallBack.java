package com.morrow.feign;

import org.springframework.stereotype.Component;

@Component
public class ProviderFeignClientCallBack implements ProviderClient{

    /**
     * 熔断降级的方法
     */
    @Override
    public String feignProvider(String name) {

        return "熔断....";
    }
}
