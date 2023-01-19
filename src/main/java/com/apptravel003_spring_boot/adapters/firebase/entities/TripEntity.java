package com.apptravel003_spring_boot.adapters.firebase.entities;

import com.apptravel003_spring_boot.domain.models.Trip;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collectionName = "Trip")
public class TripEntity {
    @DocumentId
    private String id_doc;
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
    private List<String> activityEntityList;
    private List<String> userEntityList;

    public Trip toTrip() {
        Trip trip = new Trip();
        BeanUtils.copyProperties(this, trip);
        return trip;
    }
}
