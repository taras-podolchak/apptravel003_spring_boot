package com.apptravel003_spring_boot.domain.persistence_ports;

import com.apptravel003_spring_boot.domain.models.Activity;
import com.apptravel003_spring_boot.domain.models.Trip;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface TripPersistence {
    Flux<Trip> getTrips();
}
