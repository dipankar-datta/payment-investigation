package com.application.paymentinvestigation.services;

import com.application.paymentinvestigation.data.entities.Correspondence;
import com.application.paymentinvestigation.data.repositories.CorrespondenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorrespondenceService {

    private CorrespondenceRepository correspondenceRepository;

    public CorrespondenceService(CorrespondenceRepository correspondenceRepository) {
        this.correspondenceRepository = correspondenceRepository;
    }

    public Correspondence saveCorrespondence(Correspondence correspondence) {
        return correspondenceRepository.save(correspondence);
    }

    public List<Correspondence> getCorrespondencesByCase(String caseNumber) {
        return correspondenceRepository.findByCasebook(caseNumber);
    }
}