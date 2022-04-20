package com.java.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderController
 * @Description SpringCloudAlibaba
 * @Author oldghoast
 * @Date 2022/4/16 20:55
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功！");
        String msg = restTemplate.getForObject("http://stock-service/stock/reduct", String.class);
        return "Hello World"+msg;
    }

}
