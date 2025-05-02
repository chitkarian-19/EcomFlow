package com.example.Ecommerce.service;

import com.example.Ecommerce.controller.UserController;
import com.example.Ecommerce.model.User;
import com.example.Ecommerce.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private EncryptionService encryptionService;

    @Autowired
    private UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    public User saveUser(User user) throws Exception{
        String encryptedPassword = encryptionService.hashPassword(user.getPassword());
        logger.info("Encrypted Password {}",encryptedPassword);
        user.setPassword(encryptedPassword);
        return userRepository.save(user);
    }
}
