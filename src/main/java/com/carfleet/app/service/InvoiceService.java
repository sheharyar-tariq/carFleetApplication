package com.carfleet.app.service;

import com.carfleet.app.dao.InvoiceRepository;
import com.carfleet.app.dao.StateRepository;
import com.carfleet.app.model.Invoice;
import com.carfleet.app.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;
    public List<Invoice> getInvoices() {
        return invoiceRepository.findAll();
    }
    public void SaveInvoice(Invoice invoice){
        invoiceRepository.save(invoice);
    }

    public Optional<Invoice> findById(int invoiceId){
        return invoiceRepository.findById(invoiceId);
    }

    public void DeleteInvoice(int invoiceId){
        invoiceRepository.deleteById(invoiceId);
    }

}
