package com.application.paymentinvestigation.data.repositories;

import com.application.paymentinvestigation.data.entities.DropdownData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DropdownDataRepository extends JpaRepository<DropdownData, Long> {

    List<DropdownData> findByIsActiveIs(String isActive);
}
