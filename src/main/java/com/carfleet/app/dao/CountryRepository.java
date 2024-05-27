package com.carfleet.app.dao;



import com.carfleet.app.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {

}

