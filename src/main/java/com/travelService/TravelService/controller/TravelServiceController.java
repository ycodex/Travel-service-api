package com.travelService.TravelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travelService.TravelService.model.Trip;
import com.travelService.TravelService.model.stats;
import com.travelService.TravelService.service.TripService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class TravelServiceController {
	
	@Autowired
	TripService service;
	
	@PostMapping("/api-travel/travels")
	public Trip createTrip(@org.springframework.web.bind.annotation.RequestBody Trip tripDetails) {
		System.out.println(tripDetails);
		return service.createTrip(tripDetails);
	}
	
	@PutMapping("/api-travels/travels/{id}")
	public Trip updateTrip(@PathVariable int id) {
		return service.updateTrip(id);
	}
	
	@GetMapping("/api-travels/travels")
	public List<Trip> getAllTrips(){
		return service.getAllTrips();
	}
	
	@DeleteMapping("/api-travels/travels")
	public void deleteAllTrips() {
		service.deleteAllTrips();
	}
	
	@GetMapping("/api-travels/stats")
	public stats getStats() {
		return service.getStats();
	}
}
