package com.study.springcloud.springcloudordinaryuserservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.study.springcloud.springcloudordinaryuserservice.entity.OrderInfo;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/user/findOrderById/{id}")
    public OrderInfo findOrderById(@PathVariable Long id){    
        return (OrderInfo) restTemplate.getForEntity("http://localhost:8000/findOrderById/"+id, OrderInfo.class).getBody();
    }
}
