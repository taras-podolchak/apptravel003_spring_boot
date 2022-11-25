package com.apptravel003_spring_boot.adapters.firebase.daos;

import com.apptravel003_spring_boot.adapters.firebase.entities.ActivityEntity;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;

public interface ActivityRepository extends FirestoreReactiveRepository<ActivityEntity> {


}
