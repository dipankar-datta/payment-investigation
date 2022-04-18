package com.application.paymentinvestigation.rest.controllers;

import com.application.paymentinvestigation.services.CacheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clear-cache")
public class CacheController {

    private CacheService cacheService;

    public CacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping
    public String clearCace() {
        cacheService.evictAllCaches();
        return "Cache cleared successfully";
    }
}
