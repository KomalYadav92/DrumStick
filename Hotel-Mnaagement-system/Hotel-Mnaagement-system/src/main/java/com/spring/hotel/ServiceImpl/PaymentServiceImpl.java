package com.spring.hotel.ServiceImpl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hotel.Entity.Payment;
import com.spring.hotel.Repository.PaymentRepo;
import com.spring.hotel.Service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	PaymentRepo paymentRepo;

	@Override
	public Payment createPayment(Payment payment) {
		Payment p = paymentRepo.save(payment);
		return p;
	}

	@Override
	public Payment getPaymentById(int id) {
		Optional<Payment> p = paymentRepo.findById((long) id);
		if(p.isPresent()) {
			return p.get();
		}
		return null;
	}

}
