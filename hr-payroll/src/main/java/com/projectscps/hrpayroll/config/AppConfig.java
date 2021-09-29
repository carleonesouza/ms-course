package com.projectscps.hrpayroll.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
@LoadBalancerClient(name = "hr-worker")
public class AppConfig {

	  @LoadBalanced
	  @Bean
	  WebClient.Builder webClientBuilder() {
	    return WebClient.builder();
	  }
}
