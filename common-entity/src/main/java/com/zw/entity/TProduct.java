package com.zw.entity;

public class TProduct {
    private Long id;


    private Long price;

    private String name;


    public TProduct(Long id, Long price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public TProduct() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
