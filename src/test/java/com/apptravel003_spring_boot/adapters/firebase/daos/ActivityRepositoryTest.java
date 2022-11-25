package com.apptravel003_spring_boot.adapters.firebase.daos;

import com.apptravel003_spring_boot.adapters.firebase.entities.ActivityEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import java.sql.Timestamp;
import java.util.Date;

//@SpringBootTest
class ActivityRepositoryTest {

    //@Autowired
    ActivityRepository activityRepository;

    //@Test
    public void testCreateActivity() {


     /*   ActivityEntity.ActivityEntityBuilder activityEntityBuilder = ActivityEntity.builder()
                .typeActivity(1)
                .statusActivity(1)
                .subtitle("Test")
                .photoActivity("Test")
                .wikiloc("Test")
                .complexity(1)
                .hoursTotal(1)
                .description("Test")
                .distance(1)
                .slope(1)
                .locationDeparture("Test")
                .locationArrival("Test")
                .dateDeparture(Timestamp.valueOf("2022-01-01 07:00:00.0"))
                .dateArrival(new Date(2014, 02, 11))
                .coordinatesDeparture("Test")
                .coordinatesArrival("Test");
        activityRepository.save(activityEntityBuilder.build()).block();
        activityRepository.save(activityEntityBuilder.typeActivity(45).subtitle("dsfsd").build()).block();
        activityRepository.save(activityEntityBuilder.statusActivity(4546).statusActivity(454).build()).block();
        activityRepository.save(activityEntityBuilder.description("dsfds").build()).block();
        activityRepository.save(activityEntityBuilder.photoActivity("dsfs").build()).block();*/


        Flux<ActivityEntity> all = activityRepository.findAll();

        all.doOnNext(
                        activityEntity -> System.out.println("va" + activityEntity)
                )

                .doOnComplete(() -> System.out.println("Ha terminado 01"))
                .blockLast();


        System.out.println("Ha terminado 02");

        /*activityRepository
                .findAll()
                .filter(activityEntity -> activityEntity.getSubtitle().equals("Test"))
                .doOnNext((ActivityEntity activityEntity) -> {
                    assertEquals("Test", activityEntity.getSubtitle());
                    assertEquals("Test", activityEntity.getPhotoActivity());
                    assertEquals("Test", activityEntity.getWikiloc());
                    assertEquals("Test", activityEntity.getDescription());
                    assertEquals("Test", activityEntity.getLocationArrival());
                    assertEquals("Test", activityEntity.getLocationDeparture());
                    assertEquals("Test", activityEntity.getCoordinatesArrival());
                    assertEquals("Test", activityEntity.getCoordinatesDeparture());
                    System.out.println(activityEntity);
                    activityRepository.deleteById(activityEntity.getId_doc()).block();
                });*/
    }
}