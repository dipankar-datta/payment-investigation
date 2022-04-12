package com.application.paymentinvestigation.data.repositories;

import com.application.paymentinvestigation.data.entities.Correspondence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CorrespondenceRepository extends JpaRepository<Correspondence, Long> {

    List<Correspondence> findByCasebook(String casebook);
}