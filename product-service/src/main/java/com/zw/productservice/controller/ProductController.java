package com.zw.productservice.controller;


import com.zw.entity.TProduct;
import com.zw.productservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private IProductService productService;



    @RequestMapping("getById/{id}")
    public TProduct getProductById(@PathVariable Long id){

        return productService.getProductById(id);

    }
}
