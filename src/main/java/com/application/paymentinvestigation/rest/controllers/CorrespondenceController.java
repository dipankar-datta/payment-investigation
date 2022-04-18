package com.application.paymentinvestigation.rest.controllers;

import com.application.paymentinvestigation.data.entities.Correspondence;
import com.application.paymentinvestigation.services.AuthenticationService;
import com.application.paymentinvestigation.services.CorrespondenceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/correspondence")
public class CorrespondenceController {

    private CorrespondenceService correspondenceService;

    private AuthenticationService authenticationService;

    public CorrespondenceController(
            CorrespondenceService correspondenceService,
            AuthenticationService authenticationService) {
        this.correspondenceService = correspondenceService;
        this.authenticationService = authenticationService;
    }

    @PostMapping
    public ResponseEntity createCorrespondence(@RequestBody Correspondence correspondence) {
        if (correspondence.getInboundOutbound().equalsIgnoreCase("inbound")){
            if (authenticationService.isValidPassword(correspondence.getPassword())) {
                return ResponseEntity.ok(correspondenceService.saveCorrespondence(correspondence));
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }

        } else {
            return ResponseEntity.ok(correspondenceService.saveCorrespondence(correspondence));
        }
    }

    @GetMapping(path = "/{caseNumber}")
    public List<Correspondence> getCorrespondencesByCase(@PathVariable String caseNumber) {
        return correspondenceService.getCorrespondencesByCase(caseNumber);
    }
}