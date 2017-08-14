package com.ideabook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 博客地址：
 * http://blog.csdn.net/forezp/article/details/69696915
 *
 */

@EnableEurekaServer // 启动一个服务注册中心，只需要一个注解@EnableEurekaServer，
					// 这个注解需要在springBoot工程的启动application类
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
