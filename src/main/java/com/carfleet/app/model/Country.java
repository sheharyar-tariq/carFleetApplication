package com.carfleet.app.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "cntryId")
    @Entity
    @Table(name="TEST_CON")
    public class Country {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cntry_id_gen")
        @SequenceGenerator(name="seq_cntry_id_gen", sequenceName="seq_cntry_id", allocationSize=1)
        @Column(name="COUNTRY_ID")
        private Integer cntryId;

        @Column(name="CODE")
        private String code;

        @Column(name="CAPITAL")
        private String capital;

        @Column(name="DESCRIPTION")
        private String description;

        @Column(name="nationality")
        private String nationality;

        @Column(name="CONTINENT")
        private String continent;

//        @OneToMany(mappedBy="country")
//        private List<State> states;
//
//    public List<State> getStates() {
//        return states;
//    }
//
//    public void setStates(List<State> states) {
//        this.states = states;
//    }

        public Integer getCntryId() {
            return cntryId;
        }

        public void setCntryId(Integer cntryId) {
            this.cntryId = cntryId;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getCapital() {
            return capital;
        }

        public void setCapital(String capital) {
            this.capital = capital;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
        public String getNationality() {
            return nationality;
        }
        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
        public String getContinent() {
            return continent;
        }
        public void setContinent(String continent) {
            this.continent = continent;
        }
}
