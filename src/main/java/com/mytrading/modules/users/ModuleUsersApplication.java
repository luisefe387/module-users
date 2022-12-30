package com.mytrading.modules.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ModuleUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleUsersApplication.class, args);
	}

}
