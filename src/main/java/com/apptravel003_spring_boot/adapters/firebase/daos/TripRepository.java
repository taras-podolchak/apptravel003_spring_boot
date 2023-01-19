package com.apptravel003_spring_boot.adapters.firebase.daos;

import com.apptravel003_spring_boot.adapters.firebase.entities.TripEntity;
import com.apptravel003_spring_boot.domain.models.Trip;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface TripRepository extends FirestoreReactiveRepository<TripEntity> {

    Mono<TripEntity> findByTitle(String title);

}
