package com.application.paymentinvestigation.data.repositories;

import com.application.paymentinvestigation.data.entities.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends JpaRepository<Case, Long> {
}
