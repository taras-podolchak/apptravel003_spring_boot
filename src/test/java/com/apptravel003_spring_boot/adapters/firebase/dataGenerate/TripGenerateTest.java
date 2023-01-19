package com.apptravel003_spring_boot.adapters.firebase.dataGenerate;

import com.apptravel003_spring_boot.adapters.firebase.daos.ActivityRepository;
import com.apptravel003_spring_boot.adapters.firebase.daos.TripRepository;
import com.apptravel003_spring_boot.adapters.firebase.daos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TripGenerateTest {

    @Autowired
    TripRepository tripRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ActivityRepository activityRepository;
/*
    // generate Trip
    @Test
    public void testGenerateTrip() {

        TripEntity.TripEntityBuilder tripEntityBuilder = TripEntity.builder()
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
                });
    }*/
/*
    // User registration for Trips
    Random randomNumberPerson = new Random();
    int low = 0;
    int high = 100;

    @Test
    public void testGenerateRelationsWithUser() {
        Flux<UserEntity> userEntity = userRepository.findAll();
        Flux<TripEntity> tripEntity = tripRepository.findAll();

        LinkedHashSet<Integer> positionPerson = new LinkedHashSet<>();

        do {
            positionPerson.add(randomNumberPerson.nextInt(high - low) + low);
        } while (positionPerson.size() < 23);

        System.err.println(positionPerson);

        List<String> newUserEntity = new ArrayList<>();


        for (int i = 0; i < positionPerson.size(); i++) {
            int result = randomNumberPerson.nextInt(high - low) + low;
            newUserEntity.add(userEntity.elementAt(result).block().getId_doc());
        }
       TripEntity newTrip= tripEntity.elementAt(4).block();
        newTrip.setUserEntityList(newUserEntity);
        tripRepository.save(newTrip).block();
    }*/

/*
    Random randomNumber = new Random();
    int low = 0;
    int high = 8;

    @Test
    public void testGenerateRelationsWithActivity() {
        Flux<ActivityEntity> activityEntity = activityRepository.findAll();
        Flux<TripEntity> tripEntity = tripRepository.findAll();

        LinkedHashSet<Integer> positionActivity = new LinkedHashSet<>();

        do {
            positionActivity.add(randomNumber.nextInt(high - low) + low);
        } while (positionActivity.size() < 4);

        System.err.println(positionActivity);

        List<String> newActivityEntity = new ArrayList<>();


        for (int i = 0; i < positionActivity.size(); i++) {
            int result = randomNumber.nextInt(high - low) + low;
            newActivityEntity.add(activityEntity.elementAt(result).block().getId_doc());
        }
        TripEntity newTrip= tripEntity.elementAt(4).block();
        newTrip.setActivityEntityList(newActivityEntity);
        tripRepository.save(newTrip).block();
    }
*/
}