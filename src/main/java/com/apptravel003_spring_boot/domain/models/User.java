package com.apptravel003_spring_boot.domain.models;


import com.google.cloud.firestore.annotation.ServerTimestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    @ServerTimestamp
    private Date entryDate;
    @ServerTimestamp
    private Date leavingDate;
    private Boolean legalConditions;
    private Boolean rememberPassword;

}