package com.study.springcloud.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
	}
}
// 微服务项目的高可用做个简单的介绍，我们一般的实现方式为通过启动两个注册中心，相互注册，实现服务的相互同步来达到高可用的目的
//配置HOST
// 127.0.0.1 peer1
// 127.0.0.1 peer2