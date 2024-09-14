package com.tmgreyhat.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties
public class SpringConfigConsumer {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigConsumer.class, args);
	}

}
