package com.application.paymentinvestigation.services;

import com.application.paymentinvestigation.data.entities.Payment;
import com.application.paymentinvestigation.data.entities.PaymentAudit;
import com.application.paymentinvestigation.data.repositories.PaymentAuditRepository;
import com.application.paymentinvestigation.data.repositories.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentAuditService {

    private PaymentAuditRepository paymentAuditRepository;

    public PaymentAuditService(PaymentAuditRepository paymentRepository) {
        this.paymentAuditRepository = paymentAuditRepository;
    }

    public List<PaymentAudit> getPaymentsBySenderRefNum(String senderRefNum) {
        return paymentAuditRepository.findByTransactionReferenceNumber(senderRefNum);
    }
}
