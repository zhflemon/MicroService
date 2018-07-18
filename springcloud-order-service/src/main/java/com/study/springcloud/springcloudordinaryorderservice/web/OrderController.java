package com.study.springcloud.springcloudordinaryorderservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.study.springcloud.springcloudordinaryorderservice.entity.OrderInfo;
import com.study.springcloud.springcloudordinaryorderservice.service.OrderService;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("findOrderById/{id}")
    public OrderInfo findById(@PathVariable Long id) {
        return orderService.findOne(id);
    }
}
