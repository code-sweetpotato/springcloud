package com.zw.cartservice.interfaces;

import com.zw.entity.TProduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PRODUCT-SERVICE")
//这个注解值告诉了调用服务的端口,还有配置路径找到对应的方法
public interface IProductService {

    @GetMapping("product/getById/1")
    public TProduct getProduct();
}
