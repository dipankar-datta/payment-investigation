package com.application.paymentinvestigation.data.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "payment_audit")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "casebook")
    public String caseBook;

    @Column(name = "user_id")
    public String userId;

    @Column(name = "access_date_time")
    public String accessDateTime;

    @Column(name = "payment_id")
    public Long paymentId;

    @Column(name = "response_status")
    public String responseStatus;

    @Column(name = "tran_date")
    public String transactionDate;

    @Column(name = "tran_ref_num")
    public String transactionReferenceNumber;

    @Column(name = "curr_amount")
    public String currentAmount;

    @Column(name = "exch_rate")
    public String exchangeRate;

    @Column(name = "payment_channel_ref")
    public String paymentChannelReference;

    @Column(name = "swift_msg_category_sub_type")
    public String swiftMsgCategorySubType;

    @Column(name = "swift_msg_type")
    public String swiftMsgType;

    @Column(name = "pay_date")
    public String paymentDate;

    @Column(name = "stp_flag")
    public String stpFlag;

    @Column(name = "credit_party_acct")
    public String creditPartyAcct;

    @Column(name = "credit_party_name")
    public String creditPartyName;

    @Column(name = "credit_party_addr_1")
    public String creditPartyAddr1;

    @Column(name = "credit_party_addr_2")
    public String creditPartyAddr2;

    @Column(name = "credit_party_addr_3")
    public String creditPartyAddr3;

    @Column(name = "credit_amount")
    public String creditAmount;

    @Column(name = "credit_value_date")
    public String creditValueDate;

    @Column(name = "beneficiary_name")
    public String beneficiaryName;

    @Column(name = "beneficiary_addr_1")
    public String beneficiaryAddr1;

    @Column(name = "beneficiary_addr_2")
    public String beneficiaryAddr2;

    @Column(name = "beneficiary_addr_3")
    public String beneficiaryAddr3;

    @Column(name = "remittance_info_2")
    public String remittanceInfo2;

    @Column(name = "remittance_info_3")
    public String remittanceInfo3;

    @Column(name = "remittance_info_4")
    public String remittanceInfo4;

    @Column(name = "debit_party_acct")
    public String debitPartyAcct;

    @Column(name = "debit_party_name")
    public String debitPartyName;

    @Column(name = "debit_party_addr_1")
    public String debitPartyAddr1;

    @Column(name = "debit_party_addr_2")
    public String debitPartyAddr2;

    @Column(name = "debit_party_addr_3")
    public String debitPartyAddr3;

    @Column(name = "debit_amount")
    public String debitAmount;

    @Column(name = "debit_value_date")
    public String debitValueDate;

    @Column(name = "sending_bank_id_type")
    public String sendingBankIdType;

    @Column(name = "sending_bank_id")
    public String sendingBankId;

    @Column(name = "sending_bank_name")
    public String sendingBankName;

    @Column(name = "sending_bank_addr_1")
    public String sendingBankAddr1;

    @Column(name = "sending_bank_addr_2")
    public String sendingBankAddr2;

    @Column(name = "sending_bank_addr_3")
    public String sendingBankAddr3;

    @Column(name = "sending_bank_tran_ref")
    public String sendingBankTranRef;

    @Column(name = "ordering_bank_id_type")
    public String orderingBankIdType;

    @Column(name = "ordering_bank_id")
    public String orderingBankId;

    @Column(name = "ordering_bank_name")
    public String orderingBankName;

    @Column(name = "ordering_bank_addr_1")
    public String orderingBankAddr1;

    @Column(name = "ordering_bank_addr_2")
    public String orderingBankAddr2;

    @Column(name = "ordering_bank_addr_3")
    public String orderingBankAddr3;

    @Column(name = "created_by")
    public String createdBy;

    @Column(name = "created_date_time")
    public String createdDateTime;

    @Column(name = "tran_status")
    public String transactionStatus;

    @Column(name = "swift_in_msg_identifier")
    public String swiftInMsgIdentifier;

    @Column(name = "swift_in_msg_type")
    public String swiftInMsgType;

    @Column(name = "swift_in_field_20")
    public String swiftInField20;

    @Column(name = "swift_in_field_21")
    public String swiftInField21;

    @Column(name = "swift_in_curr_amount")
    public String swiftInCurrAmount;

    @Column(name = "swift_in_value_date")
    public String swiftInValueDate;

    @Column(name = "swift_in_cba_bic")
    public String swiftInCbaBic;

    @Column(name = "swift_in_external_party_bic")
    public String swiftInExternalPartyBic;

    @Column(name = "swift_in_status")
    public String swiftInStatus;

//    @Column(name = "swift_in_msg_identifier")
//    public String swiftInMsgIdentifier;

    @Column(name = "swift_in_msg_sequence")
    public String swiftInMsgSequence;

    @Column(name = "swift_in_date_time")
    public String swiftInDateTime;

    @Column(name = "swift_in_source")
    public String swiftInSource;

    @Column(name = "swift_in_msg_response")
    public String swiftInMsgResponse;

    @Column(name = "swift_in_session_no")
    public String swiftInSessionNo;

    @Column(name = "swift_in_swift_msg")
    public String swiftInSwiftMsg;

    @Column(name = "swift_out_msg_identifier")
    public String swiftOutMsgIdentifier;

    @Column(name = "swift_out_msg_type")
    public String swiftOutMsgType;

     @Column(name = "swift_out_field_20")
    public String swiftOutField20;

     @Column(name = "swift_out_field_21")
    public String swiftOutField21;

     @Column(name = "swift_out_curr_amount")
    public String swiftOutCurrAmount;

     @Column(name = "swift_out_value_date")
    public String swiftOutValueDate;

     @Column(name = "swift_out_remitter")
    public String swiftOutRemitter;

     @Column(name = "swift_out_bnp")
    public String swiftOutBnp;

     @Column(name = "swift_out_cba_bic")
    public String swiftOutCbaBic;

     @Column(name = "swift_out_external_party_bic")
    public String swiftOutExternalPartyBic;

     @Column(name = "swift_out_status")
    public String swiftOutStatus;

     @Column(name = "swift_out_msg_id")
    public String swiftOutMsgId;

     @Column(name = "swift_out_msg_sequence")
    public String swiftOutMsgSequence;

     @Column(name = "swift_out_date_time")
    public String swiftOutDateTime;

     @Column(name = "swift_out_source")
    public String swiftOutSource;

     @Column(name = "swift_out_msg_response")
    public String swiftOutMsgResponse;

     @Column(name = "swift_out_session_no")
    public String swiftOutSessionNo;

     @Column(name = "swift_out_correspondent_ctry")
    public String swiftOutCorrespondentCtry;

     @Column(name = "swift_out_msg_user_ref")
    public String swiftOutMsgUserRef;

     @Column(name = "swift_out_created_by")
    public String swiftOutCreatedBy;

     @Column(name = "swift_out_created_date_time")
    public String swiftOutCreatedDateTime;

     @Column(name = "swift_msg")
    public String swiftMsg;

     @Column(name = "swift_created_by")
    public String swiftCreatedBy;

     @Column(name = "swift_created_date_time")
    public String swiftCreatedDateTime;

     @Column(name = "swift_out2")
    public String swiftOut2;

     @Column(name = "swift_in_gp2_199")
    public String swiftInGp2_199;

     @Column(name = "swift_out_gp2_199")
    public String swiftOutGgp2_199;


}
