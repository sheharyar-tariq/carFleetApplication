package com.carfleet.app.service;

import com.carfleet.app.dao.InvoiceStatusRepository;
import com.carfleet.app.model.InvoiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {
    @Autowired
    private InvoiceStatusRepository invoiceStatusRepository;

    public List<InvoiceStatus> getAllInvoiceStatus(){
        return invoiceStatusRepository.findAll();
    }
    public void saveInvoiceStatus(InvoiceStatus InvoiceStatus){
        invoiceStatusRepository.save(InvoiceStatus);
    }
    public Optional<InvoiceStatus> findById(int InvoiceStatusId){
        return invoiceStatusRepository.findById(InvoiceStatusId);
    }
    public void deleteById(int InvoiceStatusId) {
        invoiceStatusRepository.deleteById(InvoiceStatusId);
    }

}
