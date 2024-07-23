package com.devsuperior.hruser.controller;

import com.devsuperior.hruser.entities.User;
import com.devsuperior.hruser.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserRepository repository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        Optional<User> user = repository.findById(id);
        return ResponseEntity.ok().body(user.orElse(null));
    }

    @GetMapping
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
        Optional<User> user = repository.findByEmail(email);
        return ResponseEntity.ok().body(user.orElse(null));
    }


}
