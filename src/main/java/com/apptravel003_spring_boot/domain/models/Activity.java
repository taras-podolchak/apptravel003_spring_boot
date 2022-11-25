package com.apptravel003_spring_boot.domain.models;

import java.io.Serializable;
import java.sql.Timestamp;

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
    private Timestamp dateDeparture;
    private Timestamp dateArrival;
    private String coordinatesDeparture;
    private String coordinatesArrival;

    public Activity() {
        //empty for framework
    }

    public Activity(Integer typeActivity, Integer statusActivity, String subtitle, String photoActivity, String wikiloc, Integer complexity, Integer hoursTotal, String description, Integer distance, Integer slope, String locationDeparture, String locationArrival, Timestamp dateDeparture, Timestamp dateArrival, String coordinatesDeparture, String coordinatesArrival) {
        this.typeActivity = typeActivity;
        this.statusActivity = statusActivity;
        this.subtitle = subtitle;
        this.photoActivity = photoActivity;
        this.wikiloc = wikiloc;
        this.complexity = complexity;
        this.hoursTotal = hoursTotal;
        this.description = description;
        this.distance = distance;
        this.slope = slope;
        this.locationDeparture = locationDeparture;
        this.locationArrival = locationArrival;
        this.dateDeparture = dateDeparture;
        this.dateArrival = dateArrival;
        this.coordinatesDeparture = coordinatesDeparture;
        this.coordinatesArrival = coordinatesArrival;
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

    public Timestamp getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(Timestamp dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public Timestamp getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(Timestamp dateArrival) {
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

    @Override
    public String toString() {
        return "Activity{" +
                "typeActivity=" + typeActivity +
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