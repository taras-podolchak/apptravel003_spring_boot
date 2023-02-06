package com.apptravel003_spring_boot.adapters.firebase.persistence;

import com.apptravel003_spring_boot.domain.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class UserPersistenceFirestoreIT {
    @Autowired
    private UserPersistenceFirestore userPersistenceFirestore;

    @Test
    void testGetUsers() {
        this.userPersistenceFirestore.getUsers()
                .collectList()
                .block()
                .forEach((User user) -> {
                    assertNotNull(user);
                    assertNotNull(user.getAddress());
                    assertNotNull(user.getCountry());
                    assertNotNull(user.getEmail());
                    assertNotNull(user.getDocumentNumber());
                    assertNotNull(user.getName());
                    assertNotNull(user.getLeavingDate());
                    assertNotNull(user.getEntryDate());
                    assertNotNull(user.getLeavingDate());
                    assertNotNull(user.getNationality());
                });

    }

}