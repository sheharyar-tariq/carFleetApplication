package com.carfleet.app.service;

import com.carfleet.app.dao.CountryRepository;
import com.carfleet.app.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountry() {
        List<Country> country = countryRepository.findAll();
        return country;
    }

    public void saveCountry(Country country){
        countryRepository.save(country);
    }

    public Optional<Country> findById(int cntryId){
        return countryRepository.findById(cntryId);
    }
    public void Delete(int cntryId){
            countryRepository.deleteById(cntryId);
    }
}
