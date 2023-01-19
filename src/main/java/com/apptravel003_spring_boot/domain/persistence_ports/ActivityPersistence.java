package com.apptravel003_spring_boot.domain.persistence_ports;

import com.apptravel003_spring_boot.domain.models.Activity;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ActivityPersistence {

    Flux<Activity> getActivities();

    Mono<Activity> getActivity(String idDoc);

}
