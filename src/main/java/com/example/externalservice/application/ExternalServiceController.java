package com.example.externalservice.application;

import com.example.externalservice.domain.ExternalServiceResponse;
import com.example.externalservice.infrastructure.ExternalServiceClient;
import com.example.externalservice.application.ExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/external-service")
public class ExternalServiceController {

    @Autowired
    private ExternalService externalService;

    @GetMapping
    public ResponseEntity<ExternalServiceResponse> getExternalService() {
        return ResponseEntity.ok(externalService.callExternalService());
    }
}