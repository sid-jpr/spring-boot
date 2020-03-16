package com.example.demo.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.CarPrice;

@Transactional
public interface CarRepository extends JpaRepository<CarPrice, Long>{

}