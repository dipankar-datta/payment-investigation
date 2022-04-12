package com.application.paymentinvestigation.rest.controllers;

import com.application.paymentinvestigation.data.entities.Correspondence;
import com.application.paymentinvestigation.services.CorrespondenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/correspondence")
public class CorrespondenceController {

    private CorrespondenceService correspondenceService;

    public CorrespondenceController(CorrespondenceService correspondenceService) {
        this.correspondenceService = correspondenceService;
    }

    @PostMapping
    public Correspondence createCorrespondence(@RequestBody Correspondence correspondence) {
        return correspondenceService.saveCorrespondence(correspondence);
    }

    @GetMapping(path = "/{caseNumber}")
    public List<Correspondence> getCorrespondencesByCase(@PathVariable String caseNumber) {
        return correspondenceService.getCorrespondencesByCase(caseNumber);
    }
}