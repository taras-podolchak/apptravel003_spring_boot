package com.apptravel003_spring_boot.adapters.firebase.persistence;

import com.apptravel003_spring_boot.adapters.firebase.daos.ActivityRepository;
import com.apptravel003_spring_boot.adapters.firebase.daos.TripRepository;
import com.apptravel003_spring_boot.adapters.firebase.daos.UserRepository;
import com.apptravel003_spring_boot.adapters.firebase.entities.TripEntity;
import com.apptravel003_spring_boot.domain.exceptions.NotFoundException;
import com.apptravel003_spring_boot.domain.models.Activity;
import com.apptravel003_spring_boot.domain.models.Trip;
import com.apptravel003_spring_boot.domain.models.User;
import com.apptravel003_spring_boot.domain.persistence_ports.TripPersistence;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Repository("tripPersistence")
public class TripPersistenceFirestore implements TripPersistence {

    private final TripRepository tripRepository;
    private final UserRepository userRepository;
    private final ActivityRepository activityRepository;

    @Autowired
    public TripPersistenceFirestore(TripRepository tripRepository, UserRepository userRepository, ActivityRepository activityRepository) {
        this.tripRepository = tripRepository;
        this.userRepository = userRepository;
        this.activityRepository = activityRepository;
    }

    @Override
    public Flux<Trip> getTrips() {
        return this.tripRepository.findAll().map(TripEntity::toTrip);
    }

    @Override
    public Mono<Trip> getTripWithUsersWithActivities(String title) {
        Trip newTrip = new Trip();

        this.tripRepository.findByTitle(title)
                .switchIfEmpty(Mono.error(new NotFoundException("Non existent trip with title: " + title)))
                .doOnNext(trip -> {
                    BeanUtils.copyProperties(trip, newTrip);
                    newTrip.setUserList(getUsersByIdUsersList(trip.getUserEntityList()));
                    newTrip.setActivityList(getActivitiesByIdUsersList(trip.getActivityEntityList()));
                }).block();

        return Mono.just(newTrip);
    }

    private List<User> getUsersByIdUsersList(List<String> idUsersList) {
        return idUsersList.stream()
                .map((String idUser) ->
                        this.userRepository.findById(idUser)
                                .block()
                                .toUser())
                .collect(Collectors.toList());
    }

    private List<Activity> getActivitiesByIdUsersList(List<String> idActivitiesList) {
        return idActivitiesList.stream()
                .map((String idActivity) ->
                        this.activityRepository.findById(idActivity)
                                .block()
                                .toActivity())
                .collect(Collectors.toList());
    }

}