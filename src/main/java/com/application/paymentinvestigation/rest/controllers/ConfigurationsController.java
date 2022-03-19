package com.application.paymentinvestigation.rest.controllers;

import com.application.paymentinvestigation.rest.response.DropdownResponse;
import com.application.paymentinvestigation.services.ConfigurationsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/configurations")
public class ConfigurationsController {

    private ConfigurationsService configurationsService;

    public ConfigurationsController(ConfigurationsService configurationsService) {
        this.configurationsService = configurationsService;
    }

    @GetMapping
    public Map<String, List<DropdownResponse>> getConfigurations() {
        return this.configurationsService.getStaticConfigurations();
    }
}
