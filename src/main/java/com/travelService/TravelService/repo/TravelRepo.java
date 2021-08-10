package com.travelService.TravelService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelService.TravelService.model.Trip;

@Repository
public interface TravelRepo extends JpaRepository<Trip, Integer>{
	Trip findById(int id);
}
