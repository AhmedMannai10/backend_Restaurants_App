package com.eduapp.v1.user;

import com.eduapp.v1.user.entities.User;
import com.eduapp.v1.user.repository.IUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    private final static Logger log = LoggerFactory.getLogger(UserConfig.class);

    @Bean
    public CommandLineRunner demo(IUserRepository userRepository) {
        return args -> {
            userRepository.save(new User("ghost", "ar", "ghostar@gamil.com", "secret"));
            userRepository.save(new User("cyber", "ghost", "cyber@gamil.com", "cyber"));
            userRepository.save(new User("test", "test", "dark@gamil.com", "dark"));
        };
    }
}
