package com.apptravel003_spring_boot.adapters.firebase.daos;

import com.apptravel003_spring_boot.adapters.firebase.entities.UserEntity;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;

public interface UserRepository extends FirestoreReactiveRepository<UserEntity> {

}
