package com.zw.cartservice.controller;



import com.zw.cartservice.interfaces.IProductService;
import com.zw.entity.TProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("cart")
public class CartController {

    //private final String PRODUCT_SERVICE_URL = "http://PRODUCT-SERVICE/product/getById/1";
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IProductService productService;

    @RequestMapping("get")
    public TProduct getTproductById(){

        //RestTemplate restTemplate = new RestTemplate();
        return productService.getProduct();

    }
}
