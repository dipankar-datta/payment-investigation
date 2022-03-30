package com.application.paymentinvestigation.rest.controllers;

import com.application.paymentinvestigation.data.entities.Payment;
import com.application.paymentinvestigation.data.entities.PaymentAudit;
import com.application.paymentinvestigation.services.PaymentAuditService;
import com.application.paymentinvestigation.services.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/payments")
public class PaymentController {

    private PaymentService paymentService;

    private PaymentAuditService paymentAuditService;

    public PaymentController(PaymentService paymentService, PaymentAuditService paymentAuditService) {
        this.paymentService = paymentService;
        this.paymentAuditService = paymentAuditService;
    }

    @GetMapping(path = "/research/{senderRefNum}")
    public Payment getPaymentDetailsBySenderRefNum(@PathVariable String senderRefNum) {
        return paymentService.getPaymentsBySenderRefNum(senderRefNum).orElse(null);
    }

    @GetMapping(path = "/research/{senderRefNum}/audit")
    public List<PaymentAudit> getPaymentDetailsAudit(@PathVariable String senderRefNum) {
        return paymentAuditService.getPaymentsBySenderRefNum(senderRefNum);
    }
}
