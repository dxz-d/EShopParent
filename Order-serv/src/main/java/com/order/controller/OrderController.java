package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/create")
    public String createOrder(Integer productId, Integer userId) {
        String productName = restTemplate.getForObject("http://localhost:9000/product/" + productId, String.class);
        return "用户：" +userId + "购买商品：" +productName;
    }
}
