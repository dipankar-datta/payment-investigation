package com.application.paymentinvestigation.rest.controllers;

import com.application.paymentinvestigation.data.entities.Payment;
import com.application.paymentinvestigation.services.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/payments")
public class PaymentController {

    public PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping(path = "/research/{senderRefNum}")
    public Payment getPaymentDetailsBySenderRefNum(@PathVariable String senderRefNum) {
        return paymentService.getPaymentsBySenderRefNum(senderRefNum).orElse(null);
    }
}
