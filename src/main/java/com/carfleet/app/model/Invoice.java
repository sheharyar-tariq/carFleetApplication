package com.carfleet.app.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "invoiceId")
@Table(name="TEST_INVOICE")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_INVOICE_ID_GEN")
    @SequenceGenerator(name="SEQ_INVOICE_ID_GEN", sequenceName="SEQ_INVOICE_ID", allocationSize=1)
    @Column(name = "INVOICE_ID")
    private Integer invoiceId;

    @Column(name = "I_DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String invoiceDate;

    @Column(name = "I_TYPE")
    private String invoiceType;

    @Column(name = "REMARKS")
    private String remarks;

    @ManyToOne
    @JoinColumn(name="INVOICE_STATUS_ID",insertable = false,updatable = false)
    private InvoiceStatus invoiceStatus;

    @Column(name = "INVOICE_STATUS_ID")
    private Integer invoiceStatusId;

    @ManyToOne
    @JoinColumn(name="clientId",insertable = false,updatable = false)
    private Client client;
    private Integer clientId;


    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }


    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Integer getInvoiceStatusId() {
        return invoiceStatusId;
    }

    public void setInvoiceStatusId(Integer invoiceStatusId) {
        this.invoiceStatusId = invoiceStatusId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

}
