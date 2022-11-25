package com.apptravel003_spring_boot.domain.models;

import java.time.LocalDateTime;
import java.util.List;

public class User {

    private Integer typeUser;
    private Integer statusUser;
    private String name;
    private String nickname;
    private String surname;
    private String secondSurname;
    private List<Integer> preferActivity;
    private Integer phoneNumber;
    private String email;
    private String country;
    private String address;
    private String location;
    private Integer postalCode;
    private Integer documentType;
    private String documentNumber;
    private String nationality;
    private String photoUser;
    private String photoOrganization;
    private LocalDateTime entryDate;
    private LocalDateTime leavingDate;
    private Boolean legalConditions;
    private Boolean rememberPassword;

    public User() {
        //empty for framework
    }

    public User(Integer typeUser, Integer statusUser, String name, String nickname, String surname, String secondSurname, List<Integer> preferActivity, Integer phoneNumber, String email, String country, String address, String location, Integer postalCode, Integer documentType, String documentNumber, String nationality, String photoUser, String photoOrganization, LocalDateTime entryDate, LocalDateTime leavingDate, Boolean legalConditions, Boolean rememberPassword) {
        this.typeUser = typeUser;
        this.statusUser = statusUser;
        this.name = name;
        this.nickname = nickname;
        this.surname = surname;
        this.secondSurname = secondSurname;
        this.preferActivity = preferActivity;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.country = country;
        this.address = address;
        this.location = location;
        this.postalCode = postalCode;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.nationality = nationality;
        this.photoUser = photoUser;
        this.photoOrganization = photoOrganization;
        this.entryDate = entryDate;
        this.leavingDate = leavingDate;
        this.legalConditions = legalConditions;
        this.rememberPassword = rememberPassword;
    }

    public Integer getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(Integer typeUser) {
        this.typeUser = typeUser;
    }

    public Integer getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(Integer statusUser) {
        this.statusUser = statusUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public List<Integer> getPreferActivity() {
        return preferActivity;
    }

    public void setPreferActivity(List<Integer> preferActivity) {
        this.preferActivity = preferActivity;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhotoUser() {
        return photoUser;
    }

    public void setPhotoUser(String photoUser) {
        this.photoUser = photoUser;
    }

    public String getPhotoOrganization() {
        return photoOrganization;
    }

    public void setPhotoOrganization(String photoOrganization) {
        this.photoOrganization = photoOrganization;
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDateTime getLeavingDate() {
        return leavingDate;
    }

    public void setLeavingDate(LocalDateTime leavingDate) {
        this.leavingDate = leavingDate;
    }

    public Boolean getLegalConditions() {
        return legalConditions;
    }

    public void setLegalConditions(Boolean legalConditions) {
        this.legalConditions = legalConditions;
    }

    public Boolean getRememberPassword() {
        return rememberPassword;
    }

    public void setRememberPassword(Boolean rememberPassword) {
        this.rememberPassword = rememberPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "typeUser=" + typeUser +
                ", statusUser=" + statusUser +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", surname='" + surname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                ", preferActivity=" + preferActivity +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", postalCode=" + postalCode +
                ", documentType=" + documentType +
                ", documentNumber='" + documentNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                ", photoUser='" + photoUser + '\'' +
                ", photoOrganization='" + photoOrganization + '\'' +
                ", entryDate=" + entryDate +
                ", leavingDate=" + leavingDate +
                ", legalConditions=" + legalConditions +
                ", rememberPassword=" + rememberPassword +
                '}';
    }
}