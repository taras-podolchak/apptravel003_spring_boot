package com.apptravel003_spring_boot.adapters.rest;

import com.apptravel003_spring_boot.domain.models.Trip;
import com.apptravel003_spring_boot.domain.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/trips")
public class TripResource {
    private final TripService tripService;

    @Autowired
    public TripResource(TripService tripService) {
        this.tripService = tripService;
    }

    // http://localhost:8080/trips/getTrips
    @GetMapping("/getTrips")
    public Flux<Trip> getTrips() {
        return tripService.getTrips();
    }

    // http://localhost:8080/trips/getTrip/Navalmedio.%20Senda%20Whistler-Pto.%20de%20Navacerrada-Las%20Cabrillas.
    @GetMapping("/getTrip/{title}")
    public Mono<Trip> getTripWithUsersWithActivities(@PathVariable String title) {
        return tripService.getTripWithUsersWithActivities(title);
    }
}
