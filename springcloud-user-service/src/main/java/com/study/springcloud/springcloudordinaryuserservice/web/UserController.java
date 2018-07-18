package com.study.springcloud.springcloudordinaryuserservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.study.springcloud.springcloudordinaryuserservice.entity.OrderInfo;

@RestController
public class UserController {

	 @Autowired
	    private RestTemplate restTemplate;
	    @Autowired
	    private EurekaClient discoveryClient;

	    public String serviceUrl() {
	        InstanceInfo instance = discoveryClient.getNextServerFromEureka("SPRINGCLOUD-ORDER-SERVICE", false);
	        return instance.getHomePageUrl();
	    }

	    @GetMapping("/user/findOrderById/{id}")
	    public OrderInfo findOrderById(@PathVariable Long id){    
	        return (OrderInfo) restTemplate.getForEntity(this.serviceUrl()+"/findOrderById/"+id, OrderInfo.class).getBody();
	    }
}
