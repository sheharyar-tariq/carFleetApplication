package com.carfleet.app.service;

import com.carfleet.app.dao.EmployeeTypeRepository;
import com.carfleet.app.model.EmployeeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {
    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    public List<EmployeeType> getAllEmployeeTypes(){
        return employeeTypeRepository.findAll();
    }
    public void saveEmployeeType(EmployeeType EmployeeType){
        employeeTypeRepository.save(EmployeeType);
    }
    public Optional<EmployeeType> findById(int EmployeeTypeId){
        return employeeTypeRepository.findById(EmployeeTypeId);
    }
    public void deleteById(int EmployeeTypeId) {
        employeeTypeRepository.deleteById(EmployeeTypeId);
    }

}
