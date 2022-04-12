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
//        String productName = restTemplate.getForObject("http://localhost:9000/product/" + productId, String.class);
//        String userName = restTemplate.getForObject("http://localhost:10000/user/" + userId, String.class);
        String result = restTemplate.getForObject("http://stock-serv/stock/reduce/" + productId, String.class);
//        String shopCartRest = restTemplate.getForObject("http://localhost:12000/shopcart/remove?productId=" + productId + "&userId" + userId, String.class);
//        return "用户：" +userName + ",购买商品：" +productName + "," + result + ","+ shopCartRest + "。" ;
        return result;
    }

}
