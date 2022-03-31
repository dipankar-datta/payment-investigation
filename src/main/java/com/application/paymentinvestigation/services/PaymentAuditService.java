package com.application.paymentinvestigation.services;

import com.application.paymentinvestigation.data.entities.PaymentAudit;
import com.application.paymentinvestigation.data.repositories.PaymentAuditRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentAuditService {

    private PaymentAuditRepository paymentAuditRepository;

    public PaymentAuditService(PaymentAuditRepository paymentAuditRepository) {
        this.paymentAuditRepository = paymentAuditRepository;
    }

    public List<PaymentAudit> getPaymentsBySenderRefNum(String senderRefNum) {
        return paymentAuditRepository.findByTransactionReferenceNumber(senderRefNum);
    }
}
