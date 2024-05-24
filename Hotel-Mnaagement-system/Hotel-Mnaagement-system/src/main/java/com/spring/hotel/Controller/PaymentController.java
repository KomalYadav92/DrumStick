package com.spring.hotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hotel.Entity.Payment;
import com.spring.hotel.Service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
	
	@PostMapping("/hotel/payment")
	public Payment createPayment(@RequestBody Payment payment) {
		return paymentService.createPayment(payment);
		
	}
	@GetMapping("/hotel/payment/{id}")
	public Payment getPaymentById(@PathVariable("id")int id) {
		return paymentService.getPaymentById(id);
		
	}
	

}
