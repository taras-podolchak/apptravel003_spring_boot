package com.apptravel003_spring_boot.adapters.firebase.entities;

import com.apptravel003_spring_boot.domain.models.User;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.firestore.annotation.ServerTimestamp;
import com.google.cloud.spring.data.firestore.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collectionName = "User")
public class UserEntity {
    @DocumentId
    private String id_doc;
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
    @ServerTimestamp
    private Date entryDate;
    @ServerTimestamp
    private Date leavingDate;
    private Boolean legalConditions;
    private Boolean rememberPassword;

    public String getId_doc() {
        return id_doc;
    }

    public void setId_doc(String id_doc) {
        this.id_doc = id_doc;
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

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getLeavingDate() {
        return leavingDate;
    }

    public void setLeavingDate(Date leavingDate) {
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

    public User toUser() {
        User user = new User();
        BeanUtils.copyProperties(this, user);
        return user;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id_doc='" + id_doc + '\'' +
                ", typeUser=" + typeUser +
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
