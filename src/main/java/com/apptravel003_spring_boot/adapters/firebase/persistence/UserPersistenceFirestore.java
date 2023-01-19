package com.apptravel003_spring_boot.adapters.firebase.persistence;

import com.apptravel003_spring_boot.adapters.firebase.daos.UserRepository;
import com.apptravel003_spring_boot.adapters.firebase.entities.UserEntity;
import com.apptravel003_spring_boot.domain.models.User;
import com.apptravel003_spring_boot.domain.persistence_ports.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository("userPersistence")
public class UserPersistenceFirestore implements UserPersistence {

    private final UserRepository userRepository;

    @Autowired
    public UserPersistenceFirestore(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Flux<User> getUsers() {
        return this.userRepository.findAll().map(UserEntity::toUser);
    }

}