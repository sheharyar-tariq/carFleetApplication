package com.carfleet.app.dao;


import com.carfleet.app.model.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle,Integer> {

}

