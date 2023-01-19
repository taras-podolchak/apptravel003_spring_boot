package com.apptravel003_spring_boot.adapters.firebase.entities;

import com.apptravel003_spring_boot.domain.models.Activity;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.firestore.annotation.ServerTimestamp;
import com.google.cloud.spring.data.firestore.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collectionName = "Activity")
public class ActivityEntity {
    @DocumentId
    private String id_doc;
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

    public Activity toActivity() {
        Activity activity = new Activity();
        BeanUtils.copyProperties(this, activity);
        return activity;
    }
}
