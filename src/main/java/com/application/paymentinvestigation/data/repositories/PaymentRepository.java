package com.application.paymentinvestigation.data.repositories;

import com.application.paymentinvestigation.data.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Optional<Payment> findByTransactionReferenceNumber(String transactionReferenceNumber);
}
