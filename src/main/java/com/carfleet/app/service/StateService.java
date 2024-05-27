package com.carfleet.app.service;

import com.carfleet.app.dao.StateRepository;
import com.carfleet.app.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> getStates(){
        List<State> states = stateRepository.findAll();
        return states;
    }
    public void SaveState(State state){
        stateRepository.save(state);
    }

    public Optional<State> findById(int stateId){
        return stateRepository.findById(stateId);
    }

    public void DeleteState(int stateId){
        stateRepository.deleteById(stateId);
    }

}
