package com.travelService.TravelService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelService.TravelService.model.Trip;
import com.travelService.TravelService.model.stats;
import com.travelService.TravelService.repo.TravelRepo;

@Service
public class TripService {
	
	@Autowired
	TravelRepo repo;
	
	public Trip createTrip(Trip tripDetails) {
		return repo.save(tripDetails);
		
	}
	
	public Trip updateTrip(int id) {
		return repo.findById(id);
	}
	
	public List<Trip> getAllTrips(){
		return repo.findAll();
	}
	
	public void deleteAllTrips() {
		repo.deleteAll();
	}
	
	public stats getStats() {
		
		long c=repo.count();
		int sum=0;
		float max=0,min=0;
		
		List<Trip> list=repo.findAll();
		for(Trip t:list) {
			sum+=t.getAmount();
			if(t.getAmount()>max) {
				max=t.getAmount();
			}
			if(t.getAmount()<min) {
				min=t.getAmount();
			}
		}
		stats s=new stats(sum,sum/c,max,min,c);
		return s;
	}
}
