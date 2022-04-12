package com.application.paymentinvestigation.rest.controllers;

import com.application.paymentinvestigation.data.entities.Correspondence;
import com.application.paymentinvestigation.services.CorrespondenceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/correspondence")
public class CorrespondenceController {

    private CorrespondenceService correspondenceService;

    public CorrespondenceController(CorrespondenceService correspondenceService) {
        this.correspondenceService = correspondenceService;
    }

    @GetMapping(path = "/{caseNumber}")
    public List<Correspondence> getCorrespondencesByCase(@PathVariable String caseNumber) {
        return correspondenceService.getCorrespondencesByCase(caseNumber);
    }
}