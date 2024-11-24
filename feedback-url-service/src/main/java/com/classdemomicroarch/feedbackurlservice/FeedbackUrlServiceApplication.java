package com.classdemomicroarch.feedbackurlservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FeedbackUrlServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(FeedbackUrlServiceApplication.class, args);
  }
}
