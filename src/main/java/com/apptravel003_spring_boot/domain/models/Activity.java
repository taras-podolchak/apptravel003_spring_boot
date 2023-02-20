package com.apptravel003_spring_boot.domain.models;


import com.google.cloud.firestore.annotation.ServerTimestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    private Integer typeActivity;
    private Integer statusActivity;
    private String subtitle;
    private String photoActivity;
    private String wikiloc;
    private Integer complexity;
    private Integer hoursTotal;
    private String description;
    private Integer distance;
    private Integer slope;
    private String locationDeparture;
    private String locationArrival;
    @ServerTimestamp
    private Date dateDeparture;
    @ServerTimestamp
    private Date dateArrival;
    private String coordinatesDeparture;
    private String coordinatesArrival;

}