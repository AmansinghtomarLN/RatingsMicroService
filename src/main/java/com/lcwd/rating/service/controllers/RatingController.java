package com.lcwd.rating.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.rating.service.entities.Rating;
import com.lcwd.rating.service.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	@PostMapping()
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
	}
	
	@GetMapping()
	public ResponseEntity<List<Rating>> getRating(){
		return ResponseEntity.ok().body(ratingService.getAllRating());
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		return ResponseEntity.ok().body(ratingService.getAllRatingsByUserId(userId));
	}
	
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId ){
		return ResponseEntity.ok().body(ratingService.getAllRatingsByHotelId(hotelId));
	}
	
	
}
