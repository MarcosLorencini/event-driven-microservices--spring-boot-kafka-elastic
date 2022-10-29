package com.mircoservices.demo.twitter.to.service;

import com.mircoservices.demo.twitter.to.service.config.TwitterToKafkaServiceConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);

    // teve que colocar um construtor para inicializar
    //One of two major advantages of constructor injection is that it allows to be in to be immutable, since
    //you can define the property as final and immutable objects helps to create more robust and thread-safe applications.
    //Constructor injection also forces that the object is created with the required dependency as the constructor
    //forces it. And finally, Spring doesn't use a reflection with constructor approach, unlike field injection.
    //reflection makes the application code to run slower since it involves types that are dynamic result at runtime.
    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;
    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfigData configData) {
        this.twitterToKafkaServiceConfigData = configData;
    }
    //ou injetar por anotação
    //@Autowired
    //private TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

    public static void main(String[] args) {SpringApplication.run(TwitterToKafkaServiceApplication.class, args); }


    @Override
    public void run(String... args) throws Exception {
        LOG.info("App start");
        LOG.info(Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeywords().toArray(new String[] {})));
        LOG.info(twitterToKafkaServiceConfigData.getWelcomeMessage());

    }

}
