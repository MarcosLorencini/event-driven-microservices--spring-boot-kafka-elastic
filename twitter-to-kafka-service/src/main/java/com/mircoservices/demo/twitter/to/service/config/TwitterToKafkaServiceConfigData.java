package com.mircoservices.demo.twitter.to.service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data//getter, setter and hashcode and to string
@Configuration //to make the class a spring bean
@ConfigurationProperties(prefix = "twitter-to-kafka-service")//definido no arquivo application.yml
public class TwitterToKafkaServiceConfigData {
    //Then as a private list of string, with name Twitter keywords here.
    //The naming is important, and this should match to the definition and the application YAML file
    private List<String> twitterKeywords;
    private String welcomeMessage;
}
