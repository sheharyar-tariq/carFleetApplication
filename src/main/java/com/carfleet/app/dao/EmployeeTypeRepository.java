package com.carfleet.app.dao;


import com.carfleet.app.model.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType,Integer> {

}

