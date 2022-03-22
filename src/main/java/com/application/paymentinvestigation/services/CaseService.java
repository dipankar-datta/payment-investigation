package com.application.paymentinvestigation.services;

import com.application.paymentinvestigation.data.entities.Case;
import com.application.paymentinvestigation.data.repositories.CaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaseService {

    private CaseRepository caseRepository;

    public CaseService(CaseRepository caseRepository) {
        this.caseRepository = caseRepository;
    }

    public List<Case> getAllCases() {
        return caseRepository.findAll();
    }

    public Optional<Case> getCaseById(Long id) {
        return caseRepository.findById(id);
    }

    public Case saveCase(Case caseRecord) {
        return caseRepository.save(caseRecord);
    }
}
