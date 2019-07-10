package com.dupin.erwin.security;

import com.dupin.erwin.model.User;
import com.dupin.erwin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String emailOrUsername) throws UsernameNotFoundException {
        User user = userRepository.findByEmailOrUsername(emailOrUsername, emailOrUsername)
                .orElseThrow(() ->
                        new UsernameNotFoundException("No user found with username or email :" + emailOrUsername));

        return UserPrincipal.create(user);

    }

    @Transactional
    public UserDetails loadUserById(Long id){
        User user = userRepository.findById(id).orElseThrow(
                () -> new UsernameNotFoundException("No user found with id : "  + id));

        return UserPrincipal.create(user);
    }

}
