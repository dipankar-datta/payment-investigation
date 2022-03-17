package com.application.paymentinvestigation.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Table(name = "case")
@Entity
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "case_number")
    public String caseNumber;

    @Column(name = "bank")
    public String bank;

    @Column(name = "branch")
    public String branch;

    @Column(name = "inquiry_id")
    public String inquiryId;

    @Column(name = "inquirer_name")
    public String inquirerName;

    @Column(name = "inquirer_id_type")
    public String inquirerIdType;

    @Column(name = "inquiry_ref")
    public String inquiryRef;

    @Column(name = "inquiry_date")
    public String inquiryDate;

    @Column(name = "assigned_to")
    public String assignedTo;

    @Column(name = "status")
    public String status;

    @Column(name = "investigation_type")
    public String investigationType;

    @Column(name = "inquirer_address")
    public String inquirerAddress;

    @Column(name = "priority")
    public String priority;

    @Column(name = "close_date")
    public String closeDate;

    @Column(name = "amount")
    public String amount;

    @Column(name = "post_date")
    public String postDate;

    @Column(name = "eq_currency")
    public String eqCurrency;

    @Column(name = "currency")
    public String currency;

    @Column(name = "tran_ref")
    public String tranRef;

    @Column(name = "value_date")
    public String valueDate;

    @Column(name = "our_ref")
    public String ourRef;

    @Column(name = "their_ref")
    public String theirRef;

    @Column(name = "uetr_121")
    public String uetr121;

    @Column(name = "eq_amount")
    public String eqAmount;

    @Column(name = "paid_received_indicator")
    public String paidReceivedIndicator;

    @Column(name = "original_instruction_ref")
    public String originalInstructionRef;

    @Column(name = "ordering_inst_address")
    public String orderingInstAddress;

    @Column(name = "ordering_cust_address")
    public String orderingCustAddress;

    @Column(name = "ordering_cust_id")
    public String orderingCustId;

    @Column(name = "ordering_cust_type")
    public String orderingCustType;

    @Column(name = "ordering_cust_name")
    public String orderingCustName;

    @Column(name = "beneficiary_address")
    public String beneficiaryAddress;

    @Column(name = "beneficiary_id")
    public String beneficiaryId;

    @Column(name = "beneficiary_type")
    public String beneficiaryType;

    @Column(name = "beneficiary_name")
    public String beneficiaryName;

    @Column(name = "instructed_amt")
    public String instructedAmt;

    @Column(name = "instructed_ccy")
    public String instructedCcy;

    @Column(name = "receiving_inst_address")
    public String receivingInstAddress;

    @Column(name = "receiving_inst_id")
    public String receivingInstId;

    @Column(name = "receiving_inst_type")
    public String receivingInstType;

    @Column(name = "receiving_inst_name")
    public String receivingInstName;

    @Column(name = "sending_inst_address")
    public String sendingInstAddress;

    @Column(name = "sending_inst_id")
    public String sendingInstId;

    @Column(name = "sending_inst_type")
    public String sendingInstType;

    @Column(name = "sending_inst_name")
    public String sendingInstName;

    @Column(name = "default_currency")
    public String defaultCurrency;
}
