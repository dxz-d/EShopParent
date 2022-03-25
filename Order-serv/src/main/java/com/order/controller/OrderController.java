package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;

@RestController
@RequestMapping("/order")
public class OrderController {

//    @Autowired
//    private RestTemplate restTemplate;
    
    @PostMapping("/create")
    @ResponseBody
    public String createOrder(@RequestBody Integer productId, @RequestBody Integer userId) {
//        String productName = restTemplate.getForObject("http://localhost:9000/product/" + productId, String.class);
        System.out.println("1111");
        return "用户：" +userId + "购买商品：" +productId;
    }
}
