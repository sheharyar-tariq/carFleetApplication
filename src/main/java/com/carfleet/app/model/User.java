package com.carfleet.app.model;

//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
@Table(name = "TEST_USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER_ID_GEN")
    @SequenceGenerator(name="SEQ_USER_ID_GEN", sequenceName="SEQ_USER_ID", allocationSize=1)
    @Column(name = "USER_ID")
    private int userId;

    @Column(name="USER_NME")
    private String username;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="FIRST_NME")
    private String firstName;

    @Column(name="LAST_NME")
    private String lastName;

    @Column(name="EMAIL_TXT")
    private String emailTxt;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailTxt() {
        return emailTxt;
    }

    public void setEmailTxt(String emailTxt) {
        this.emailTxt = emailTxt;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}