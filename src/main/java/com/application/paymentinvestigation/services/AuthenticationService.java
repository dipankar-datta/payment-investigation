package com.application.paymentinvestigation.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Value("${app.admin.password}")
    private String adminPassword;

    public boolean isValidPassword(String password) {
        return password != null && password.equals(adminPassword);
    }
}
