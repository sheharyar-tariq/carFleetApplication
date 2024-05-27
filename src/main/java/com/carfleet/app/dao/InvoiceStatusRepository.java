package com.carfleet.app.dao;


import com.carfleet.app.model.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus,Integer> {

}

