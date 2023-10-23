package com.surfhub.jwtservice.controllers;

import com.surfhub.jwtservice.user.User;
import com.surfhub.jwtservice.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<User>> listUsers() {
        return ResponseEntity.ok(userService.listUsers());
    }

    @PostMapping("/findbyemail")
    public ResponseEntity<Optional<User>> findByEmail(@RequestBody User user) {
        return ResponseEntity.ok(userService.findByEmail(user.getEmail()));
    }
}
