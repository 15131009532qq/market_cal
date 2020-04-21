package com.mudule.mumzonemarketcal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MumzoneMarketCalApplication {
    public static void main(String[] args) {
        SpringApplication.run(MumzoneMarketCalApplication.class, args);
    }

}
