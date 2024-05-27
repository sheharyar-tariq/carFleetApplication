package com.carfleet.app.model;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;

@MappedSuperclass
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name="TEST_COMMONOBJECT")
public class CommonObject extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_common_id_gen")
    @SequenceGenerator(name="seq_common_id_gen", sequenceName="seq_common_id", allocationSize=1)
    @Column(name="ID")
    private Integer id;
    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="DETAILS")
    private String details;

    public CommonObject() {

    }

    public CommonObject(Integer id, String description, String details) {
        this.id = id;
        this.description = description;
        this.details = details;
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

    @Override
    public String toString() {
        return "CommonObject [id=" + id + ", description=" + description + ", details=" + details + "]";
    }


}
