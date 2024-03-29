package com.apptravel003_spring_boot.domain.persistence_ports;

import com.apptravel003_spring_boot.domain.models.User;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface UserPersistence {

    Flux<User> getUsers();

}
