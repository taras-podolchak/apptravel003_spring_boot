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

    public User toUser() {
        User user = new User();
        BeanUtils.copyProperties(this, user);
        return user;
    }
}
