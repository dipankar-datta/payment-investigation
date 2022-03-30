package com.application.paymentinvestigation.data.repositories;

import com.application.paymentinvestigation.data.entities.Payment;
import com.application.paymentinvestigation.data.entities.PaymentAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentAuditRepository extends JpaRepository<PaymentAudit, Long> {

    List<PaymentAudit> findByTransactionReferenceNumber(String transactionReferenceNumber);
}
