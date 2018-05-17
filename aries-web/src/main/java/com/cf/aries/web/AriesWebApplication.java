package com.cf.aries.web;

import feign.Retryer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;


@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class AriesWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AriesWebApplication.class, args);
		log.info("Server start success");
	}

	@Bean
	Retryer feignRetryer() {
		return Retryer.NEVER_RETRY;
	}
}
