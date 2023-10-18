package com.surfhub.jwtservice.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public List<User> listUsers() {
        System.out.println("respuiesta  " + this.userRepository.findAll());
        return this.userRepository.findAll();
    }
}
