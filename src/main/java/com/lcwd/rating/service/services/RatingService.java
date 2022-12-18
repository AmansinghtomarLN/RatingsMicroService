package com.lcwd.rating.service.services;

import java.util.List;

import com.lcwd.rating.service.entities.Rating;

public interface RatingService {

	Rating createRating(Rating rating);
	
	List<Rating> getAllRating();
	
	List<Rating> getAllRatingsByUserId(String userId);
	
	List<Rating> getAllRatingsByHotelId(String hotelId);
	
}
