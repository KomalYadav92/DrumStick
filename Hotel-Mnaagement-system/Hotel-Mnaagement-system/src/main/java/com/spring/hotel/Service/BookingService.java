package com.spring.hotel.Service;

import com.spring.hotel.Entity.Booking;

public interface BookingService {
	Booking createBooking (Booking booking);
	Booking getBookingById(int id);

}
