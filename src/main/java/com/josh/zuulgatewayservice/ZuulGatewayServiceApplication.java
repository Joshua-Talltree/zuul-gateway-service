package com.josh.zuulgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;


@SpringBootApplication
public class ZuulGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayServiceApplication.class, args);
	}

	public WebMvcAutoConfiguration corsConfiguration() {
		return new WebMvcAutoConfiguration() {

		};
	}
}
