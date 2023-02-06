package com.apptravel003_spring_boot.adapters.firebase.persistence;

import com.apptravel003_spring_boot.domain.models.Activity;
import com.apptravel003_spring_boot.domain.models.Trip;
import com.apptravel003_spring_boot.domain.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TripPersistenceFirestoreIT {

    @Autowired
    private TripPersistenceFirestore tripPersistenceFirestore;

    @Test
    void testGetTrips() {
        this.tripPersistenceFirestore.getTrips()
                .collectList()
                .block()
                .forEach((Trip trip) -> {
                    assertNotNull(trip);
                    assertNotNull(trip.getTitle());
                    assertNotNull(trip.getStatusTrip());
                    assertNotNull(trip.getTransportType());
                    assertNotNull(trip.getTypeTrip());
                    assertNotNull(trip.getLevel());
                    assertNotNull(trip.getReturnTrip());
                    assertNotNull(trip.getOneWayTrip());
                    assertNotNull(trip.getPrice());
                    assertNotNull(trip.getPhotoTrip());
                });

    }

    @Test
    void teatGetTripWithUsersWithActivities() {
        Trip trip = this.tripPersistenceFirestore.getTripWithUsersWithActivities("Fin de Año montañero. Pirineo Aragonés.").block();

        assertNotNull(trip);
        assertEquals("Fin de Año montañero. Pirineo Aragonés.", trip.getTitle());
        assertEquals(1, trip.getStatusTrip());
        assertEquals(1, trip.getTransportType());
        assertEquals(1, trip.getTypeTrip());
        assertEquals(3, trip.getLevel());
        assertEquals(550, trip.getReturnTrip());
        assertEquals(600, trip.getOneWayTrip());
        assertEquals(230, trip.getPrice());
        assertEquals("/findeanoamigosmontana.jpg", trip.getPhotoTrip());
        trip.getActivityList()
                .forEach((Activity activity) -> {
                    assertNotNull(activity);
                    assertNotNull(activity.getSubtitle());
                    assertNotNull(activity.getLocationArrival());
                    assertNotNull(activity.getLocationDeparture());
                    assertNotNull(activity.getTypeActivity());
                    assertNotNull(activity.getStatusActivity());
                    assertNotNull(activity.getComplexity());
                    assertNotNull(activity.getHoursTotal());
                    assertNotNull(activity.getDistance());
                    assertNotNull(activity.getSlope());
                });
        trip.getUserList()
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