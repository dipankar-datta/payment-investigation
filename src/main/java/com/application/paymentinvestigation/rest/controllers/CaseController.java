package com.application.paymentinvestigation.rest.controllers;

import com.application.paymentinvestigation.data.entities.Case;
import com.application.paymentinvestigation.rest.request.CaseRequest;
import com.application.paymentinvestigation.rest.response.CaseResponse;
import com.application.paymentinvestigation.services.CaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/cases")
public class CaseController {

    private CaseService caseService;

    public CaseController(CaseService caseService) {
        this.caseService = caseService;
    }

    @GetMapping
    public List<Case> getAllCases() {
        return caseService.getAllCases();
    }

    @GetMapping("/{id}")
    public Case getCase(@PathVariable Long id) {
        return caseService.getCaseById(id).orElse(null);
    }

    @PostMapping
    public CaseResponse saveCase(@RequestBody CaseRequest caseRequest) {
        return CaseResponse.fromEntityToResponse(caseService.saveCase(caseRequest.toEntity()));
    }


}
