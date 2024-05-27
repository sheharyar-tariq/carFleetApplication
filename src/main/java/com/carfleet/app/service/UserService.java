package com.carfleet.app.service;

import com.carfleet.app.dao.UserRepository;
import com.carfleet.app.model.Country;
import com.carfleet.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder encoder;

    public void saveUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }


}
