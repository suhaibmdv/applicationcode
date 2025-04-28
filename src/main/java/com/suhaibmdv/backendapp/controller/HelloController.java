package com.suhaibmdv.backendapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from the GitOps-managed backend! Deployed by Suhaib using ArgoCD and Jenkins.";
    }
    
    @GetMapping("/health")
    public String health() {
        return "UP";
    }
    
    @GetMapping("/info")
    public String info() {
        return "Backend Application v1.0.0 - Running on Kubernetes";
    }
}
