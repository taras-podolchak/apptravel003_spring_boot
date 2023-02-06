package com.apptravel003_spring_boot.adapters.rest;

import com.apptravel003_spring_boot.domain.models.Activity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RestTestConfig
class ActivityResourceIT {
/*
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testGetActivities() {
    }

    @Test
    void testGetActivity() {
        this.webTestClient
                .get()
                .uri("/activities/getActivity/{subtitle}" + "7KZC837cekB2jDz1vxQO")
                .exchange()
                .expectStatus().isOk()
                .expectBody(Activity.class)
                .value(Assertions::assertNotNull)
                .value(activity -> {
                    assertEquals("Otal", activity.getSubtitle());
                    assertEquals("Oto", activity.getLocationArrival());
                    assertEquals("Oto", activity.getLocationDeparture());
                    assertEquals(1, activity.getTypeActivity());
                    assertEquals(1, activity.getStatusActivity());
                    assertEquals(9, activity.getComplexity());
                    assertEquals(7, activity.getHoursTotal());
                    assertEquals(9, activity.getDistance());
                    assertEquals(1400, activity.getSlope());
                });
 */
    //}
}