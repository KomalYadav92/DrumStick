package com.spring.hotel.Service;

import com.spring.hotel.Entity.Payment;

public interface PaymentService {
	Payment createPayment(Payment payment);
	Payment getPaymentById(int id);
	

}
