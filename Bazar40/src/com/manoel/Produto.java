package com.manoel;

import enums.OrderStatus;

public class Produto {
    private String name;
    private Double price;
    private OrderStatus status;

    //CONSTRUTOR
    public Produto(String name, Double price, OrderStatus status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    //ENCAPSULAMENTO
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
