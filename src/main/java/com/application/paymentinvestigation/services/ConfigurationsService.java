package com.application.paymentinvestigation.services;

import com.application.paymentinvestigation.data.repositories.DropdownDataRepository;
import com.application.paymentinvestigation.rest.response.DropdownResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ConfigurationsService {

    private DropdownDataRepository dropdownDataRepository;

    public ConfigurationsService(DropdownDataRepository dropdownDataRepository) {
        this.dropdownDataRepository = dropdownDataRepository;
    }

    @Cacheable("configurations")
    public Map<String, List<DropdownResponse>> getStaticConfigurations() {
        return this.dropdownDataRepository.findByIsActiveIs("y").stream().map(DropdownResponse::fromEntityToResponse).collect(
                Collectors.groupingBy(DropdownResponse::getFieldName));
    }
}
