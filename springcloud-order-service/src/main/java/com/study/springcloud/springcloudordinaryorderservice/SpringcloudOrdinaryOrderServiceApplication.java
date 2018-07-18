package com.study.springcloud.springcloudordinaryorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudOrdinaryOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudOrdinaryOrderServiceApplication.class, args);
	}
}
