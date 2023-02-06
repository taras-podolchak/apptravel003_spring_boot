package com.apptravel003_spring_boot.adapters.firebase.persistence;


import com.apptravel003_spring_boot.domain.models.Activity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ActivityPersistenceFirestoreIT {

    @Autowired
    private ActivityPersistenceFirestore activityPersistenceFirestore;

    @Test
    void testGetActivities() {

        this.activityPersistenceFirestore.getActivities()
                .collectList()
                .block()
                .forEach((Activity activity) -> {
                    assertNotNull(activity);
                    assertNotNull(activity.getSubtitle());
                    assertNotNull(activity.getLocationArrival());
                    assertNotNull(activity.getLocationDeparture());
                    assertNotNull(activity.getTypeActivity());
                    assertNotNull(activity.getStatusActivity());
                    assertNotNull(activity.getComplexity());
                    assertNotNull(activity.getHoursTotal());
                    assertNotNull(activity.getDistance());
                    assertNotNull(activity.getSlope());
                });
    }

    @Test
    void testGetActivity() {
        this.activityPersistenceFirestore.getActivity("7KZC837cekB2jDz1vxQO")
                .doOnNext(activity -> {
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
    }
}