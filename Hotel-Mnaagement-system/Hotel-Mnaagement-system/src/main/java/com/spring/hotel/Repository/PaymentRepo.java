package com.spring.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.hotel.Entity.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Long> {

}
