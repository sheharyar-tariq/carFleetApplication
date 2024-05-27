package com.carfleet.app.model;

//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "locationId")

@Table(name="TEST_LOC")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_location_id_gen")
    @SequenceGenerator(name="seq_location_id_gen", sequenceName="seq_location_id", allocationSize=1)
    @Column(name = "LOCATION_ID")
    private Integer locationId;

    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="DETAILS")
    private String details;

    @Column(name="CITY")
    private String city;

    @Column(name="ADDRESS")
    private String address;


    @ManyToOne
    @JoinColumn(name="COUNTRY_ID",updatable = false,insertable = false)
    private Country country;
    @Column(name="COUNTRY_ID")
    private Integer countryId;

    @ManyToOne
    @JoinColumn(name="STATE_ID",updatable = false,insertable = false)
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Column(name="STATE_ID")
    private Integer stateId;

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }



    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }
}
