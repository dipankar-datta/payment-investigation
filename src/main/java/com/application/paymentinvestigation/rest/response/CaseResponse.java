package com.application.paymentinvestigation.rest.response;

import com.application.paymentinvestigation.data.entities.Case;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaseResponse {

    public Long id;
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
    public Integer amount;
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

    public static CaseResponse fromEntityToResponse(Case caseRecord) {
        return CaseResponse.builder()
                .id(caseRecord.getId())
                .caseNumber(caseRecord.getCaseNumber())
                .bank(caseRecord.getBank())
                .branch(caseRecord.getBranch())
                .inquiryId(caseRecord.getInquiryId())
                .inquirerName(caseRecord.getInquirerName())
                .inquirerIdType(caseRecord.getInquirerIdType())
                .inquiryDate(caseRecord.getInquiryDate())
                .inquirerAddress(caseRecord.getInquirerAddress())
                .assignedTo(caseRecord.getAssignedTo())
                .inquiryRef(caseRecord.getInquiryRef())
                .status(caseRecord.getStatus())
                .investigationType(caseRecord.getInvestigationType())
                .priority(caseRecord.getPriority())
                .closeDate(caseRecord.getCloseDate())
                .amount(caseRecord.getAmount())
                .postDate(caseRecord.getPostDate())
                .eqCurrency(caseRecord.getEqCurrency())
                .currency(caseRecord.getCurrency())
                .valueDate(caseRecord.getValueDate())
                .ourRef(caseRecord.getOurRef())
                .theirRef(caseRecord.getTheirRef())
                .uetr121(caseRecord.getUetr121())
                .eqAmount(caseRecord.getEqAmount())
                .paidReceivedIndicator(caseRecord.getPaidReceivedIndicator())
                .originalInstructionRef(caseRecord.getOriginalInstructionRef())
                .orderingInstAddress(caseRecord.getOrderingInstAddress())
                .orderingCustAddress(caseRecord.getOrderingCustAddress())
                .orderingCustId(caseRecord.getOrderingCustId())
                .orderingCustType(caseRecord.getOrderingCustType())
                .orderingCustName(caseRecord.getOrderingCustName())
                .beneficiaryAddress(caseRecord.getBeneficiaryAddress())
                .beneficiaryId(caseRecord.getBeneficiaryId())
                .beneficiaryName(caseRecord.getBeneficiaryName())
                .instructedAmt(caseRecord.getInstructedAmt())
                .instructedCcy(caseRecord.getInstructedCcy())
                .receivingInstAddress(caseRecord.getReceivingInstAddress())
                .receivingInstId(caseRecord.getReceivingInstId())
                .receivingInstType(caseRecord.getReceivingInstType())
                .receivingInstName(caseRecord.getReceivingInstName())
                .sendingInstAddress(caseRecord.getSendingInstAddress())
                .sendingInstId(caseRecord.getSendingInstId())
                .sendingInstType(caseRecord.getSendingInstType())
                .sendingInstName(caseRecord.getSendingInstName())
                .defaultCurrency(caseRecord.getDefaultCurrency())
                .build();

    }

}
