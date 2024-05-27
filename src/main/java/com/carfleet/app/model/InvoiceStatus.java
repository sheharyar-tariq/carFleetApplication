package com.carfleet.app.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
//@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "invoiceId")
@Table(name="TEST_INVOICE_STATUS")
public class InvoiceStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_INVOICE_STATUS_ID_GEN")
    @SequenceGenerator(name = "SEQ_INVOICE_STATUS_ID_GEN", sequenceName = "SEQ_INVOICE_STATUS_ID", allocationSize = 1)
    @Column(name = "INVOICE_STATUS_ID")
    private Integer invoiceStatusId;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DETAILS")
    private String details;


    public Integer getInvoiceStatusId() {
        return invoiceStatusId;
    }

    public void setInvoiceStatusId(Integer invoiceStatusId) {
        this.invoiceStatusId = invoiceStatusId;
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
}
