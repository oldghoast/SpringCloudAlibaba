package com.java.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功！");
        return "Hello World";
    }

}
