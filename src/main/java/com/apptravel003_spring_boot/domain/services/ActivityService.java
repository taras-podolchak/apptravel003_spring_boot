package com.apptravel003_spring_boot.domain.services;


import com.apptravel003_spring_boot.domain.models.Activity;
import com.apptravel003_spring_boot.domain.persistence_ports.ActivityPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ActivityService {

    private final ActivityPersistence activityPersistence;

    @Autowired
    public ActivityService(ActivityPersistence activityPersistence) {
        this.activityPersistence = activityPersistence;
    }

    public Flux<Activity> getActivities() {
        return activityPersistence.getActivities();
    }

    public Mono<Activity> getActivity(String idDoc) {
        return activityPersistence.getActivity(idDoc);
    }
}
