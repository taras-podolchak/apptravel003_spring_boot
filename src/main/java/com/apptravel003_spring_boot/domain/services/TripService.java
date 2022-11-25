package com.apptravel003_spring_boot.domain.services;


import com.apptravel003_spring_boot.domain.models.Trip;
import com.apptravel003_spring_boot.domain.persistence_ports.TripPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class TripService {

    private final TripPersistence tripPersistence;

    @Autowired
    public TripService(TripPersistence tripPersistence) {
        this.tripPersistence = tripPersistence;
    }

    public Flux<Trip> getTrips() {
        return tripPersistence.getTrips();
    }
}
