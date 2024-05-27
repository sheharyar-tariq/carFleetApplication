package com.carfleet.app.service;

import com.carfleet.app.dao.UserRepository;
import com.carfleet.app.model.User;
import com.carfleet.app.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        System.out.print("User" + user);
        if (user == null) {
            throw new UsernameNotFoundException("User Not found");
        }
        return new UserPrincipal(user);
    }
}
