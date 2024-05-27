package com.carfleet.app.controller;

import com.carfleet.app.model.Client;
import com.carfleet.app.model.Invoice;
import com.carfleet.app.model.InvoiceStatus;
import com.carfleet.app.model.Location;
import com.carfleet.app.service.ClientService;
import com.carfleet.app.service.InvoiceService;
import com.carfleet.app.service.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class InvoiceController {
    @Autowired
    public InvoiceService invoiceService;
    @Autowired
    public ClientService clientService;
    @Autowired
    public InvoiceStatusService invoiceStatusService ;


    @GetMapping("/invoices")
    public String getAllinvoice(Model model) {
         model.addAttribute("invoiceStatus",invoiceStatusService.getAllInvoiceStatus());
         model.addAttribute("invoices",invoiceService.getInvoices());
         model.addAttribute("clients",clientService.getClients());
        return "Invoices";
    }
    @PostMapping("/invoices/addNew")
    public String addNew(Invoice invoice) {
        invoiceService.SaveInvoice(invoice);
        return "redirect:/invoices";
    }
    @RequestMapping("/invoices/findById")
    @ResponseBody
    public Optional<Invoice> editLocation(Integer invoiceId){
        return invoiceService.findById(invoiceId);
    }
    @PostMapping("/invoices/update")
    public String update(Invoice invoice) {
        invoiceService.SaveInvoice(invoice);
        return "redirect:/invoices";
    }
    @RequestMapping(value = "/invoices/deleteById",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteLocation(Integer invoiceId){
        invoiceService.DeleteInvoice(invoiceId);
        return "redirect:/invoices";
    }
}
