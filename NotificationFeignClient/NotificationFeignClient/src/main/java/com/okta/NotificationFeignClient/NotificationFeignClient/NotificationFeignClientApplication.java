package com.okta.NotificationFeignClient.NotificationFeignClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class NotificationFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationFeignClientApplication.class, args);
	}

}
