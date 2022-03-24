package com.application.paymentinvestigation.services;

import com.application.paymentinvestigation.data.entities.Payment;
import com.application.paymentinvestigation.data.repositories.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Optional<Payment> getPaymentsBySenderRefNum(String senderRefNum) {
        return paymentRepository.findByTransactionReferenceNumber(senderRefNum);
    }
}
