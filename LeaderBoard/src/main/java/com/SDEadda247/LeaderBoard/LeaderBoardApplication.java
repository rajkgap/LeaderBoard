package com.SDEadda247.LeaderBoard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
@Configuration
public class LeaderBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaderBoardApplication.class, args);
	}

}
