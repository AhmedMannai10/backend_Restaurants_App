package com.eduapp.v1.user.service;

import com.eduapp.v1.user.entities.User;
import com.eduapp.v1.user.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import com.eduapp.v1.exceptions.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserDetailsService{

    private IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create new User
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // Get All the Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserByEmail(String email){
        try{
            return userRepository.findByEmail(email);
        }catch(NotFoundException ex){
            throw new ApiRequestException("user with email(" + email +") does not exist");
        }
    }

    // Get User by ID
    public Optional<User> getUserById(Long userId) {
        try{
            return userRepository.findById(userId);
        }catch(NotFoundException ex){
            throw new ApiRequestException("User with Id(" 
                        + userId + 
                        ") does not exist ");
        }
    }

    // Update User
    public User updateUser(String email, User userDetails) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent()) {
            User existingUser = user.get();
            existingUser.setFirstName(userDetails.getFirstName());
            existingUser.setPassword(userDetails.getPassword());
            existingUser.setEmail(userDetails.getEmail());


            return userRepository.save(existingUser);
        }else{
            throw new ApiRequestException("User Does not exist");
        }
    }

    // Delete User by ID
    public boolean deleteUserById(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new ApiRequestException("User does not exist");
        }
    }

	@Override
	public UserDetailsService userDetailsService() {
        UserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
        userDetailsManager.createUser(
            org.springframework.security.core.userdetails.User.builder()
                .username("ghost")
                .password("secret")
                .roles("USER")
                .build()
        );
        userDetailsManager.createUser(
            org.springframework.security.core.userdetails.User.builder()
                .username("cyber")
                .password("cyber")
                .roles("ADMIN")
                .build()
        );

        return userDetailsManager;

	}


}
