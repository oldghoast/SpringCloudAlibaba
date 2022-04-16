package com.java.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName StockController
 * @Description SpringCloudAlibaba
 * @Author oldghoast
 * @Date 2022/4/16 20:59
 * @Version 1.0
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reduct")
    public String reduct(){
        System.out.println("扣减库存");
        return "扣减库存";
    }

}
