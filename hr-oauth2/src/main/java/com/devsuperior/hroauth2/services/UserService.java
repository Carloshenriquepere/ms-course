package com.devsuperior.hroauth2.services;

import com.devsuperior.hroauth2.entities.User;
import com.devsuperior.hroauth2.feignclients.UserFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService implements UserDetailsService {

    private final UserFeignClient userFeignClient;

    public User findByEmail(String email) {
        User user = userFeignClient.findByEmail(email).getBody();
        if (user == null) {
            log.error("User not found with email ::: {}", email);
            throw new IllegalArgumentException("Email not found");
        }
        log.info("User found with email ::: {}", email);
        return user;
    }


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userFeignClient.findByEmail(userName).getBody();
        if (user == null) {
            log.error("User Details not found with email ::: {}", userName);
            throw new UsernameNotFoundException("Email not found");
        }
        log.info("User Details found with email ::: {}", userName);
        return user;
    }
}
