package com.travelService.TravelService.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Trip {
	@Id
	int id;
	int orderNumber;
	float amount;
	Date date;
	String type;
}
