package com.carfleet.app.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "stateId")
@Table(name="TEST_STATE")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_state_id_gen")
    @SequenceGenerator(name="seq_state_id_gen", sequenceName="seq_state_id", allocationSize=1)
    @Column(name = "STATE_ID")
    private Integer stateId;

    @Column(name="NAME")
    private String name;

    @Column(name="CAPITAL")
    private String capital;

    @Column(name="CODE")
    private String code;

    @ManyToOne
    @JoinColumn(name="COUNTRY_ID",updatable = false,insertable = false)
    private Country country;

    @Column(name="COUNTRY_ID")
    private Integer countryid;

    @Column(name="DETAILS")
    private String details;

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
