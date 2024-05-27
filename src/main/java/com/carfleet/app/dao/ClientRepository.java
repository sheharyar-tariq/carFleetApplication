package com.carfleet.app.dao;


import com.carfleet.app.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <Client,Integer> {

}

