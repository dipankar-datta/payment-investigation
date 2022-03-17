package com.application.paymentinvestigation.rest.request;

import com.application.paymentinvestigation.data.entities.Case;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CaseRequest {

    public String caseNumber;
    public String bank;
    public String branch;
    public String inquiryId;
    public String inquirerName;
    public String inquirerIdType;
    public String inquiryDate;
    public String inquirerAddress;
    public String assignedTo;
    public String inquiryRef;
    public String status;
    public String investigationType;
    public String priority;
    public String closeDate;
    public String amount;
    public String postDate;
    public String eqCurrency;
    public String currency;
    public String valueDate;
    public String ourRef;
    public String theirRef;
    public String uetr121;
    public String eqAmount;
    public String paidReceivedIndicator;
    public String originalInstructionRef;
    public String orderingInstAddress;
    public String orderingCustAddress;
    public String orderingCustId;
    public String orderingCustType;
    public String orderingCustName;
    public String beneficiaryAddress;
    public String beneficiaryId;
    public String beneficiaryType;
    public String beneficiaryName;
    public String instructedAmt;
    public String instructedCcy;
    public String receivingInstAddress;
    public String receivingInstId;
    public String receivingInstType;
    public String receivingInstName;
    public String sendingInstAddress;
    public String sendingInstId;
    public String sendingInstType;
    public String sendingInstName;
    public String defaultCurrency;


    public Case toEntity() {
        Case caseRecord = new Case();
        caseRecord.setCaseNumber(caseNumber);
        caseRecord.setBank(bank);
        caseRecord.setBranch(branch);
        caseRecord.setInquiryId(inquiryId);
        caseRecord.setInquirerName(inquirerName);
        caseRecord.setInquirerIdType(inquirerIdType);
        caseRecord.setInquiryDate(inquiryDate);
        caseRecord.setInquirerAddress(inquirerAddress);
        caseRecord.setAssignedTo(assignedTo);
        caseRecord.setInquiryRef(inquiryRef);
        caseRecord.setStatus(status);
        caseRecord.setInvestigationType(investigationType);
        caseRecord.setPriority(priority);
        caseRecord.setCloseDate(closeDate);
        caseRecord.setAmount(amount);
        caseRecord.setPostDate(postDate);
        caseRecord.setEqCurrency(eqCurrency);
        caseRecord.setCurrency(currency);
        caseRecord.setValueDate(valueDate);
        caseRecord.setOurRef(ourRef);
        caseRecord.setTheirRef(theirRef);
        caseRecord.setUetr121(uetr121);
        caseRecord.setEqAmount(eqAmount);
        caseRecord.setPaidReceivedIndicator(paidReceivedIndicator);
        caseRecord.setOriginalInstructionRef(originalInstructionRef);
        caseRecord.setOrderingInstAddress(orderingInstAddress);
        caseRecord.setOrderingCustAddress(orderingCustAddress);
        caseRecord.setOrderingCustId(orderingCustId);
        caseRecord.setOrderingCustType(orderingCustType);
        caseRecord.setOrderingCustName(orderingCustName);
        caseRecord.setBeneficiaryAddress(beneficiaryAddress);
        caseRecord.setBeneficiaryId(beneficiaryId);
        caseRecord.setBeneficiaryType(beneficiaryType);
        caseRecord.setBeneficiaryName(beneficiaryName);
        caseRecord.setInstructedAmt(instructedAmt);
        caseRecord.setInstructedCcy(instructedCcy);
        caseRecord.setReceivingInstAddress(receivingInstAddress);
        caseRecord.setReceivingInstId(receivingInstId);
        caseRecord.setReceivingInstType(receivingInstType);
        caseRecord.setReceivingInstName(receivingInstName);
        caseRecord.setSendingInstAddress(sendingInstAddress);
        caseRecord.setSendingInstId(sendingInstId);
        caseRecord.setSendingInstType(sendingInstType);
        caseRecord.setSendingInstName(sendingInstName);
        caseRecord.setDefaultCurrency(defaultCurrency);

        return caseRecord;
    }

}
