package com.example.demo.services;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.CarPrice;
import com.example.demo.repositories.CarRepository;

@Service
@Repository
public class CarService {
	
	@Autowired
	private CarRepository carRepo;
	
    @Transactional
    public CarPrice saveAndFlush(CarPrice si){
        if(si != null){
            si = carRepo.saveAndFlush(si);
        }
        return si;
    }
    
}
