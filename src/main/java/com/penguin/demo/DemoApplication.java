package com.penguin.demo;

import com.penguin.demo.pojo.User;
import com.penguin.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(UserRepository userRepository) {
        return (args) -> {

            Map<String, String> users = new HashMap<>();
            users.put("AAA", "AAA");
            users.put("BBB", "BBB");
            users.put("CCC", "CCC");
            users.put("DDD", "DDD");
            users.put("EEE", "FFF");
            users.put("FFF", "FFF");
            users.put("GGG", "GGG");

            users.entrySet().stream().map(x -> new User(x.getKey(), x.getValue())).forEach(userRepository::save);
        };
    }

}
