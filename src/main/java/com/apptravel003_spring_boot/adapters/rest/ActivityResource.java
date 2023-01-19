package com.apptravel003_spring_boot.adapters.rest;

import com.apptravel003_spring_boot.domain.models.Activity;
import com.apptravel003_spring_boot.domain.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/activities")
public class ActivityResource {
    private final ActivityService activityService;

    @Autowired
    public ActivityResource(ActivityService activityService) {
        this.activityService = activityService;
    }

    // http://localhost:8080/activities/getActivities
    @GetMapping("/getActivities")
    public Flux<Activity> getActivities() {
        return activityService.getActivities();
    }

    // http://localhost:8080/activities/getActivity/7KZC837cekB2jDz1vxQO
    @GetMapping("/getActivity/{subtitle}")
    public Mono<Activity> getActivity(@PathVariable String subtitle) {
        return activityService.getActivity(subtitle);
    }
}