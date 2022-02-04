package me.reszkojr.config;

import me.reszkojr.entities.User;
import me.reszkojr.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) {
        User u1 = new User(null ,"maria", "maria@gmail.com", "4164894886", "123456");
        User u2 = new User(null,"paulo", "paulo@gmail.com", "498451354", "123456");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
