package com.travelService.TravelService.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class stats {
	int sum;
	float average;
	float max;
	float min;
	long count;
}
