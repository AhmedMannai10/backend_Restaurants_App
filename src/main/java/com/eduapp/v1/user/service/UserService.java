package com.eduapp.v1.user.service;

import com.eduapp.v1.user.entities.User;
import com.eduapp.v1.user.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Qualifier("IUserRepository")
    @Autowired
    private IUserRepository userRepository;

    // Create new User
    public User createUser(User user) {
        // we will change this to return an access token instead of the password
        return userRepository.save(user);
    }

    // Get All the Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get User by ID
    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    // Update User
    public User updateUser(Long id, User userDetails) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User existingUser = user.get();
            existingUser.setFirstName(userDetails.getFirstName());
            existingUser.setPassword(userDetails.getPassword());
            existingUser.setEmail(userDetails.getEmail());


            return userRepository.save(existingUser);
        }
        return null;
    }

    // Delete User by ID
    public String deleteUserById(Long id) {
        try {

            userRepository.deleteById(id);
            return "User with Id=" + id + " deleted successfully";
        } catch (Exception e) {
            return "User with id does not exists";
        }
    }

}
