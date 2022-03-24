package com.application.paymentinvestigation.rest.controllers;

import com.application.paymentinvestigation.data.entities.Payment;
import com.application.paymentinvestigation.services.PaymentService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
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
