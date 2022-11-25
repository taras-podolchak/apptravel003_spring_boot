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
    private List<ActivityEntity> activityEntityList;
    private List<UserEntity> userEntityList;

    public String getId_doc() {
        return id_doc;
    }

    public void setId_doc(String id_doc) {
        this.id_doc = id_doc;
    }

    public Integer getTypeTrip() {
        return typeTrip;
    }

    public void setTypeTrip(Integer typeTrip) {
        this.typeTrip = typeTrip;
    }

    public Integer getStatusTrip() {
        return statusTrip;
    }

    public void setStatusTrip(Integer statusTrip) {
        this.statusTrip = statusTrip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhotoTrip() {
        return photoTrip;
    }

    public void setPhotoTrip(String photoTrip) {
        this.photoTrip = photoTrip;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getTransportType() {
        return transportType;
    }

    public void setTransportType(Integer transportType) {
        this.transportType = transportType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public Integer getOneWayTrip() {
        return oneWayTrip;
    }

    public void setOneWayTrip(Integer oneWayTrip) {
        this.oneWayTrip = oneWayTrip;
    }

    public Integer getReturnTrip() {
        return returnTrip;
    }

    public void setReturnTrip(Integer returnTrip) {
        this.returnTrip = returnTrip;
    }

    public List<ActivityEntity> getActivityEntityList() {
        return activityEntityList;
    }

    public void setActivityEntityList(List<ActivityEntity> activityEntityList) {
        this.activityEntityList = activityEntityList;
    }

    public List<UserEntity> getUserEntityList() {
        return userEntityList;
    }

    public void setUserEntityList(List<UserEntity> userEntityList) {
        this.userEntityList = userEntityList;
    }

    public Trip toTrip() {
        Trip trip = new Trip();
        BeanUtils.copyProperties(this, trip);
        return trip;
    }

    @Override
    public String toString() {
        return "TripEntity{" +
                "id_doc='" + id_doc + '\'' +
                ", typeTrip=" + typeTrip +
                ", statusTrip=" + statusTrip +
                ", title='" + title + '\'' +
                ", photoTrip='" + photoTrip + '\'' +
                ", level=" + level +
                ", transportType=" + transportType +
                ", price=" + price +
                ", general='" + general + '\'' +
                ", recommendation=" + recommendation +
                ", safety=" + safety +
                ", oneWayTrip=" + oneWayTrip +
                ", returnTrip=" + returnTrip +
                '}';
    }
}
