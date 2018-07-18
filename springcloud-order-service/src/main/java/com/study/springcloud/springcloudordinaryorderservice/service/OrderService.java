package com.study.springcloud.springcloudordinaryorderservice.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.springcloud.springcloudordinaryorderservice.entity.OrderInfo;

@Repository
public interface OrderService extends JpaRepository<OrderInfo, Long> {
	
	
}
