package com.application.paymentinvestigation.services;

import com.application.paymentinvestigation.data.entities.Payment;
import com.application.paymentinvestigation.data.entities.PaymentAudit;
import com.application.paymentinvestigation.data.repositories.PaymentAuditRepository;
import com.application.paymentinvestigation.data.repositories.PaymentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PaymentService {

    private PaymentRepository paymentRepository;

    private PaymentAuditRepository paymentAuditRepository;

    public PaymentService(PaymentRepository paymentRepository, PaymentAuditRepository paymentAuditRepository) {
        this.paymentRepository = paymentRepository;
        this.paymentAuditRepository = paymentAuditRepository;
    }

    public Optional<Payment> getPaymentsBySenderRefNum(String senderRefNum) {
        var paymentDetails = paymentRepository.findByTransactionReferenceNumber(senderRefNum);
        if (paymentDetails.isPresent()) {
           paymentAuditRepository.save(toAudit(paymentDetails.get()));
        }
        return paymentDetails;
    }

    private PaymentAudit toAudit(Payment payment) {
        var paymentAudit = new PaymentAudit();
        paymentAudit.setCaseBook(payment.getCaseBook());
//        paymentAudit.setUserId();
        paymentAudit.setAccessDateTime(LocalDateTime.now().toString());
        paymentAudit.setPaymentId(payment.getId());
        paymentAudit.setResponseStatus(payment.getResponseStatus());
        paymentAudit.setTransactionDate(payment.getTransactionDate());
        paymentAudit.setTransactionReferenceNumber(payment.getTransactionReferenceNumber());
        paymentAudit.setCurrentAmount(payment.getCurrentAmount());
        paymentAudit.setExchangeRate(payment.getExchangeRate());
        paymentAudit.setPaymentChannelReference(payment.getPaymentChannelReference());
        paymentAudit.setSwiftMsgCategorySubType(payment.getSwiftMsgCategorySubType());
        paymentAudit.setSwiftMsgType(payment.getSwiftMsgType());
        paymentAudit.setPaymentDate(payment.getPaymentDate());
        paymentAudit.setStpFlag(payment.getStpFlag());
        paymentAudit.setCreditPartyAcct(payment.getCreditPartyAcct());
        paymentAudit.setCreditPartyName(payment.getCreditPartyName());
        paymentAudit.setCreditPartyAddr1(payment.getCreditPartyAddr1());
        paymentAudit.setCreditPartyAddr2(payment.getCreditPartyAddr2());
        paymentAudit.setCreditPartyAddr3(payment.getCreditPartyAddr3());
        paymentAudit.setCreditAmount(payment.getCreditAmount());
        paymentAudit.setCreditValueDate(payment.getCreditValueDate());
        paymentAudit.setCreditValueDate(payment.getCreditValueDate());
        paymentAudit.setBeneficiaryName(payment.getBeneficiaryName());
        paymentAudit.setBeneficiaryAddr1(payment.getBeneficiaryAddr1());
        paymentAudit.setBeneficiaryAddr2(payment.getBeneficiaryAddr2());
        paymentAudit.setBeneficiaryAddr3(payment.getBeneficiaryAddr3());
        paymentAudit.setRemittanceInfo2(payment.getRemittanceInfo2());
        paymentAudit.setRemittanceInfo3(payment.getRemittanceInfo3());
        paymentAudit.setRemittanceInfo4(payment.getRemittanceInfo4());
        paymentAudit.setDebitPartyAcct(payment.getDebitPartyAcct());
        paymentAudit.setDebitPartyName(payment.getDebitPartyName());
        paymentAudit.setDebitPartyAddr1(payment.getDebitPartyAddr1());
        paymentAudit.setDebitPartyAddr2(payment.getDebitPartyAddr2());
        paymentAudit.setDebitPartyAddr3(payment.getDebitPartyAddr3());
        paymentAudit.setDebitAmount(payment.getDebitAmount());
        paymentAudit.setDebitValueDate(payment.getDebitValueDate());
        paymentAudit.setSendingBankIdType(payment.getSendingBankIdType());
        paymentAudit.setSendingBankName(payment.getSendingBankName());
        paymentAudit.setSendingBankAddr1(payment.getSendingBankAddr1());
        paymentAudit.setSendingBankAddr2(payment.getSendingBankAddr2());
        paymentAudit.setSendingBankAddr3(payment.getSendingBankAddr3());
        paymentAudit.setSendingBankTranRef(payment.getSendingBankTranRef());
        paymentAudit.setOrderingBankIdType(payment.getOrderingBankIdType());
        paymentAudit.setOrderingBankId(payment.getOrderingBankId());
        paymentAudit.setOrderingBankName(payment.getOrderingBankName());
        paymentAudit.setOrderingBankAddr1(payment.getOrderingBankAddr1());
        paymentAudit.setOrderingBankAddr2(payment.getOrderingBankAddr2());
        paymentAudit.setOrderingBankAddr3(payment.getOrderingBankAddr3());
        paymentAudit.setCreatedBy(payment.getCreatedBy());
        paymentAudit.setCreatedDateTime(payment.getCreatedDateTime());
        paymentAudit.setTransactionStatus(payment.getTransactionStatus());
        paymentAudit.setSwiftInMsgIdentifier(payment.getSwiftInMsgIdentifier());
        paymentAudit.setSwiftInMsgType(payment.getSwiftInMsgType());
        paymentAudit.setSwiftInField20(payment.getSwiftInField20());
        paymentAudit.setSwiftInField21(payment.getSwiftInField21());
        paymentAudit.setSwiftInCurrAmount(payment.getSwiftInCurrAmount());
        paymentAudit.setSwiftInValueDate(payment.getSwiftInValueDate());
        paymentAudit.setSwiftInCbaBic(payment.getSwiftInCbaBic());
        paymentAudit.setSwiftInCbaBic(payment.getSwiftInCbaBic());
        paymentAudit.setSwiftInExternalPartyBic(payment.getSwiftInExternalPartyBic());
        paymentAudit.setSwiftInStatus(payment.getSwiftInStatus());
        paymentAudit.setSwiftInMsgSequence(payment.getSwiftInMsgSequence());
        paymentAudit.setSwiftInDateTime(payment.getSwiftInDateTime());
        paymentAudit.setSwiftInSource(payment.getSwiftInSource());
        paymentAudit.setSwiftInMsgResponse(payment.getSwiftInMsgResponse());
        paymentAudit.setSwiftInSessionNo(payment.getSwiftInSessionNo());
        paymentAudit.setSwiftInSwiftMsg(payment.getSwiftInSwiftMsg());
        paymentAudit.setSwiftOutMsgIdentifier(payment.getSwiftOutMsgIdentifier());
        paymentAudit.setSwiftOutMsgType(payment.getSwiftOutMsgType());
        paymentAudit.setSwiftOutField20(payment.getSwiftOutField20());
        paymentAudit.setSwiftOutField21(payment.getSwiftOutField21());
        paymentAudit.setSwiftOutCurrAmount(payment.getSwiftOutCurrAmount());
        paymentAudit.setSwiftOutValueDate(payment.getSwiftOutValueDate());
        paymentAudit.setSwiftOutRemitter(payment.getSwiftOutRemitter());
        paymentAudit.setSwiftOutBnp(payment.getSwiftOutBnp());
        paymentAudit.setSwiftOutCbaBic(payment.getSwiftOutCbaBic());
        paymentAudit.setSwiftOutExternalPartyBic(payment.getSwiftOutExternalPartyBic());
        paymentAudit.setSwiftOutStatus(payment.getSwiftOutStatus());
        paymentAudit.setSwiftOutMsgId(payment.getSwiftOutMsgId());
        paymentAudit.setSwiftOutMsgSequence(payment.getSwiftOutMsgSequence());
        paymentAudit.setSwiftOutDateTime(payment.getSwiftOutDateTime());
        paymentAudit.setSwiftOutSource(payment.getSwiftOutSource());
        paymentAudit.setSwiftOutMsgResponse(payment.getSwiftOutMsgResponse());
        paymentAudit.setSwiftOutSessionNo(payment.getSwiftOutSessionNo());
        paymentAudit.setSwiftOutCorrespondentCtry(payment.getSwiftOutCorrespondentCtry());
        paymentAudit.setSwiftOutMsgUserRef(payment.getSwiftOutMsgUserRef());
        paymentAudit.setSwiftOutCreatedBy(payment.getSwiftOutCreatedBy());
        paymentAudit.setSwiftOutCreatedDateTime(payment.getSwiftOutCreatedDateTime());
        paymentAudit.setSwiftMsg(payment.getSwiftMsg());
        paymentAudit.setSwiftCreatedBy(payment.getSwiftCreatedBy());
        paymentAudit.setSwiftCreatedDateTime(payment.getSwiftCreatedDateTime());
        paymentAudit.setSwiftOut2(payment.getSwiftOut2());
        paymentAudit.setSwiftInGp2_199(payment.getSwiftInGp2_199());
        paymentAudit.setSwiftOutGgp2_199(payment.getSwiftOutGgp2_199());

        return paymentAudit;
    }
}
