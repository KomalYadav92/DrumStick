package com.spring.hotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hotel.Entity.Booking;
import com.spring.hotel.Service.BookingService;

@RestController

public class BookingController {
	@Autowired
	BookingService bookingService;
	
	
	@PostMapping("/hotel/booking")
	public Booking saveBooking(@RequestBody Booking booking) {
		return bookingService.createBooking(booking);
		
	}
	@GetMapping("/hotel/booking/{id}")
	public Booking getBookingById(@PathVariable("id")int id) {
		return bookingService.getBookingById(id);
	}
	

}
