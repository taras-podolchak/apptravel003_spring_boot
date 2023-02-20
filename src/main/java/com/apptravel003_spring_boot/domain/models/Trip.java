package com.apptravel003_spring_boot.domain.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    private Integer typeTrip;
    private Integer statusTrip;
    private String title;
    private String photoTrip;
    private Integer level;
    private Integer transportType;
    private Integer price;
    private String general;
    private String recommendation;
    private String safety;
    private Integer oneWayTrip;
    private Integer returnTrip;
    private List<Activity> activityList;
    private List<User> userList;

}