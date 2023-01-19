package com.apptravel003_spring_boot.domain.models;

import java.util.List;

public class Trip {

    private Integer typeTrip;
    private Integer statusTrip;
    private String title;
    private String photoTrip;
    private Integer level;
    private Integer transportType;
    private Integer price;
    private String general;
    private Integer recommendation;
    private Integer safety;
    private Integer oneWayTrip;
    private Integer returnTrip;
    private List<Activity> activityList;
    private List<User> userList;

    public Trip() {
        //empty for framework
    }


    public Trip(Integer typeTrip, Integer statusTrip, String title, String photoTrip, Integer level, Integer transportType, Integer price, String general, Integer recommendation, Integer safety, Integer oneWayTrip, Integer returnTrip, List<Activity> activityList, List<User> userList) {
        this.typeTrip = typeTrip;
        this.statusTrip = statusTrip;
        this.title = title;
        this.photoTrip = photoTrip;
        this.level = level;
        this.transportType = transportType;
        this.price = price;
        this.general = general;
        this.recommendation = recommendation;
        this.safety = safety;
        this.oneWayTrip = oneWayTrip;
        this.returnTrip = returnTrip;
        this.activityList = activityList;
        this.userList = userList;
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

    public Integer getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Integer recommendation) {
        this.recommendation = recommendation;
    }

    public Integer getSafety() {
        return safety;
    }

    public void setSafety(Integer safety) {
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

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "typeTrip=" + typeTrip +
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