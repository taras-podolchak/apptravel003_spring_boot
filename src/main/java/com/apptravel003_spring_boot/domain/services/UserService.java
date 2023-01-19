package com.apptravel003_spring_boot.domain.services;


import com.apptravel003_spring_boot.domain.models.User;
import com.apptravel003_spring_boot.domain.persistence_ports.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserService {

    private final UserPersistence userPersistence;

    @Autowired
    public UserService(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public Flux<User> getUsers() {
        return userPersistence.getUsers();
    }

}
