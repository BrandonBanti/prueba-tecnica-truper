package com.abrandonbanti.pruebatecnica.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    public CustomUserDetailsService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // En este ejemplo siempre devuelve el mismo usuario
        if ("user".equals(username)) {
            return User.builder()
                    .username("user")
                    .password(passwordEncoder.encode("password"))
                    .roles("USER")
                    .build();
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
    }
}
