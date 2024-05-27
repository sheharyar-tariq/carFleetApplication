package com.carfleet.app.service;

import com.carfleet.app.dao.JobTitleRepository;
import com.carfleet.app.model.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {
    @Autowired
    private JobTitleRepository jobTitleRepository;

    public List<JobTitle> getAllJobTitles(){
        return jobTitleRepository.findAll();
    }
    public void saveJobTitle(JobTitle JobTitle){
        jobTitleRepository.save(JobTitle);
    }
    public Optional<JobTitle> findById(int JobTitleId){
        return jobTitleRepository.findById(JobTitleId);
    }
    public void deleteById(int JobTitleId){
        jobTitleRepository.deleteById(JobTitleId);
    }

}
