package com.zw.productservice.service.impl;

import com.zw.entity.TProduct;
import com.zw.productservice.service.IProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements IProductService {
    @Override
    public TProduct getProductById(Long id) {
        TProduct product = new TProduct(1L,998L,"FeignClient测试");

        return product;
    }
}
