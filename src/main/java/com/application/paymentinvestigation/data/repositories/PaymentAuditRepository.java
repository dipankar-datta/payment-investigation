package com.application.paymentinvestigation.data.repositories;

import com.application.paymentinvestigation.data.entities.PaymentAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentAuditRepository extends JpaRepository<PaymentAudit, Long> {

    List<PaymentAudit> findByTransactionReferenceNumber(String transactionReferenceNumber);

    List<PaymentAudit> findByCaseBook(String caseBook);
}
