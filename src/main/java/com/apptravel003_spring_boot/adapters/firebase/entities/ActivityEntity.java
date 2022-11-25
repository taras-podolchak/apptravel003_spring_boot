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

import java.io.Serializable;
import java.sql.Timestamp;
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

    public String getId_doc() {
        return id_doc;
    }

    public void setId_doc(String id_doc) {
        this.id_doc = id_doc;
    }

    public Integer getTypeActivity() {
        return typeActivity;
    }

    public void setTypeActivity(Integer typeActivity) {
        this.typeActivity = typeActivity;
    }

    public Integer getStatusActivity() {
        return statusActivity;
    }

    public void setStatusActivity(Integer statusActivity) {
        this.statusActivity = statusActivity;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPhotoActivity() {
        return photoActivity;
    }

    public void setPhotoActivity(String photoActivity) {
        this.photoActivity = photoActivity;
    }

    public String getWikiloc() {
        return wikiloc;
    }

    public void setWikiloc(String wikiloc) {
        this.wikiloc = wikiloc;
    }

    public Integer getComplexity() {
        return complexity;
    }

    public void setComplexity(Integer complexity) {
        this.complexity = complexity;
    }

    public Integer getHoursTotal() {
        return hoursTotal;
    }

    public void setHoursTotal(Integer hoursTotal) {
        this.hoursTotal = hoursTotal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getSlope() {
        return slope;
    }

    public void setSlope(Integer slope) {
        this.slope = slope;
    }

    public String getLocationDeparture() {
        return locationDeparture;
    }

    public void setLocationDeparture(String locationDeparture) {
        this.locationDeparture = locationDeparture;
    }

    public String getLocationArrival() {
        return locationArrival;
    }

    public void setLocationArrival(String locationArrival) {
        this.locationArrival = locationArrival;
    }

    public Date getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(Date dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public Date getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(Date dateArrival) {
        this.dateArrival = dateArrival;
    }

    public String getCoordinatesDeparture() {
        return coordinatesDeparture;
    }

    public void setCoordinatesDeparture(String coordinatesDeparture) {
        this.coordinatesDeparture = coordinatesDeparture;
    }

    public String getCoordinatesArrival() {
        return coordinatesArrival;
    }

    public void setCoordinatesArrival(String coordinatesArrival) {
        this.coordinatesArrival = coordinatesArrival;
    }

    public Activity toActivity() {
        Activity activity = new Activity();
        BeanUtils.copyProperties(this, activity);
        return activity;
    }

    @Override
    public String toString() {
        return "ActivityEntity{" +
                "id_doc='" + id_doc + '\'' +
                ", typeActivity=" + typeActivity +
                ", statusActivity=" + statusActivity +
                ", subtitle='" + subtitle + '\'' +
                ", photoActivity='" + photoActivity + '\'' +
                ", wikiloc='" + wikiloc + '\'' +
                ", complexity='" + complexity + '\'' +
                ", hoursTotal=" + hoursTotal +
                ", description='" + description + '\'' +
                ", distance=" + distance +
                ", slope=" + slope +
                ", locationDeparture='" + locationDeparture + '\'' +
                ", locationArrival='" + locationArrival + '\'' +
                ", dateDeparture=" + dateDeparture +
                ", dateArrival=" + dateArrival +
                ", coordinatesDeparture='" + coordinatesDeparture + '\'' +
                ", coordinatesArrival='" + coordinatesArrival + '\'' +
                '}';
    }
}
