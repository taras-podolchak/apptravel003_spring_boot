package com.apptravel003_spring_boot.adapters.firebase.daos;

import com.apptravel003_spring_boot.adapters.firebase.entities.TripEntity;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;

public interface TripRepository extends FirestoreReactiveRepository<TripEntity> {


}
