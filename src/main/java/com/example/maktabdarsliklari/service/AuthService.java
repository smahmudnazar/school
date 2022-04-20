package com.example.maktabdarsliklari.service;


import com.example.maktabdarsliklari.entity.User;
import com.example.maktabdarsliklari.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService implements UserDetailsService {

    final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> byUsername = userRepository.findByFullName(username);

        return byUsername.orElseThrow(() -> new UsernameNotFoundException("User not found!"));
    }
}
