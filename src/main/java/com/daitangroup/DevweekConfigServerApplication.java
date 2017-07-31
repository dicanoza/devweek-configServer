package com.daitangroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DevweekConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevweekConfigServerApplication.class, args);
	}
}
