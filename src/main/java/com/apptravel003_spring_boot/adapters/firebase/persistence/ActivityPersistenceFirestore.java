package com.apptravel003_spring_boot.adapters.firebase.persistence;

import com.apptravel003_spring_boot.adapters.firebase.daos.ActivityRepository;
import com.apptravel003_spring_boot.adapters.firebase.entities.ActivityEntity;
import com.apptravel003_spring_boot.domain.models.Activity;
import com.apptravel003_spring_boot.domain.persistence_ports.ActivityPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository("activityPersistence")
public class ActivityPersistenceFirestore implements ActivityPersistence {

    private final ActivityRepository activityRepository;

    @Autowired
    public ActivityPersistenceFirestore(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public Flux<Activity> getActivities() {
        return this.activityRepository.findAll().map(ActivityEntity::toActivity);
    }

    @Override
    public Mono<Activity> getActivity(String idDoc) {
        return this.activityRepository.findById(idDoc).map(ActivityEntity::toActivity);
    }
}