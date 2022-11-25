package com.apptravel003_spring_boot.adapters.firebase.persistence;

import com.apptravel003_spring_boot.adapters.firebase.daos.ActivityRepository;
import com.apptravel003_spring_boot.adapters.firebase.daos.TripRepository;
import com.apptravel003_spring_boot.adapters.firebase.entities.ActivityEntity;
import com.apptravel003_spring_boot.adapters.firebase.entities.TripEntity;
import com.apptravel003_spring_boot.domain.models.Activity;
import com.apptravel003_spring_boot.domain.models.Trip;
import com.apptravel003_spring_boot.domain.persistence_ports.TripPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository("tripPersistence")
public class TripPersistenceFirestore implements TripPersistence {

    private final TripRepository tripRepository;

    @Autowired
    public TripPersistenceFirestore(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }
    @Override
    public Flux<Trip> getTrips() {
        return this.tripRepository.findAll().map(TripEntity::toTrip);
    }
}