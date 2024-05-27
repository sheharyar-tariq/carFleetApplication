package com.carfleet.app.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "clientId")
@Table(name="TEST_CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_client_id_gen")
    @SequenceGenerator(name="seq_client_id_gen", sequenceName="seq_client_id", allocationSize=1)
    @Column(name = "CLIENT_ID")
    private Integer clientId;

    @Column(name="C_NAME")
    private String clientName;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="CITY")
    private String city;

    @Column(name="PHONE")
    private String phoneNbr;

    @Column(name="MOBILE")
    private String mobile;

    @Column(name="WEBSITE")
    private String website;

    @Column(name="EMAIL")
    private String email;

    @ManyToOne
    @JoinColumn(name="COUNTRY_ID",insertable = false,updatable = false)
    private Country country;

    @Column(name="COUNTRY_ID")
    private Integer countryId;

    @ManyToOne
    @JoinColumn(name="STATE_ID",insertable = false,updatable = false)
    private State state;

    @Column(name="STATE_ID")
    private Integer stateId;
}
