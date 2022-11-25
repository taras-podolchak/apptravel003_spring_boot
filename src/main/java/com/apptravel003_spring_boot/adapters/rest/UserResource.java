package com.apptravel003_spring_boot.adapters.rest;

import com.apptravel003_spring_boot.domain.models.User;
import com.apptravel003_spring_boot.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/users")
public class UserResource {
    private final UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/getUsers")
    public Flux<User> getUsers() {
        return userService.getUsers();
    }
}
