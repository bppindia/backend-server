package com.bpp.service;


import com.bpp.model.User;
import com.bpp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JavaMailSender mailSender;

    public void sendWelcomeEmail(User user) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(user.getEmail());
        message.setSubject("Welcome to Bharatiya Popular Party");
        message.setText("Hello " + user.getName() + ",\n\nWelcome to the party!");
        mailSender.send(message);
    }

    public void saveUser(User user) {
        userRepository.save(user);
        sendWelcomeEmail(user);
    }
}

