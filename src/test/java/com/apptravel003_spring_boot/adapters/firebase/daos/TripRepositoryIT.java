package com.apptravel003_spring_boot.adapters.firebase.daos;

import com.apptravel003_spring_boot.adapters.firebase.entities.TripEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TripRepositoryIT {

    @Autowired
    TripRepository tripRepository;

    @Test
    void testFindByTitle() {
        TripEntity tripEntity = this.tripRepository.findByTitle("Fin de Año montañero. Pirineo Aragonés.").block();
        assertEquals("Fin de Año montañero. Pirineo Aragonés.", tripEntity.getTitle());
        assertEquals(1, tripEntity.getStatusTrip());
        assertEquals(1, tripEntity.getTransportType());
        assertEquals(1, tripEntity.getTypeTrip());
        assertEquals(3, tripEntity.getLevel());
        assertEquals(550, tripEntity.getReturnTrip());
        assertEquals(600, tripEntity.getOneWayTrip());
        assertEquals(230, tripEntity.getPrice());
        assertEquals("/findeanoamigosmontana.jpg", tripEntity.getPhotoTrip());
        assertTrue(new ArrayList<>(tripEntity.getActivityEntityList())
                .containsAll(Arrays.asList("DKWZUUhxZ3tTTbJjV1QH", "aJuAO1OxnRXQOj6N9pOB", "7mGyU2uuEc0k5x0j5LLK")));
    }
}