package com.apptravel003_spring_boot.adapters.firebase.daos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TripRepositoryTest {

    @Autowired
    TripRepository tripRepository;

    //@Test
    public void testCreateTrip() {

       /* TripEntity.TripEntityBuilder tripEntityBuilder = TripEntity.builder()
                .typeTrip(1)
                .statusTrip(1)
                .title("Test")
                .photoTrip("Test")
                .level(3)
                .transportType(1)
                .price(1)
                .general("Test")
                .recommendation("Test")
                .safety("Test")
                .oneWayTrip(1)
                .returnTrip(1)
               // .activityEntityList()
               // .userEntityList()
                ;

       // tripRepository.save(tripEntityBuilder.build()).block();

        tripRepository
                .findAll()
                .filter(tripEntity -> tripEntity.getTitle().equals("Test"))
                .doOnNext(tripEntity -> {
                    assertEquals("Test", tripEntity.getTitle());
                    assertEquals("Test", tripEntity.getPhotoTrip());
                    assertEquals("Test", tripEntity.getGeneral());
                    assertEquals("Test", tripEntity.getRecommendation());
                    assertEquals("Test", tripEntity.getSafety());

                    tripRepository.deleteById(tripEntity.getId_doc()).block();
                });*/
    }

    @Test
    public void test01() {
        tripRepository
                .findAll()
                .doOnNext(tripEntity -> {
                    System.out.println("va" + tripEntity);
                }).doOnComplete(() -> System.out.println("Ha terminado 01"))
                .blockLast();
        ;
    }
}