package com.example.externalservice.infrastructure;

import com.example.externalservice.domain.ExternalServiceResponse;

public class ExternalServiceClient {
    public ExternalServiceResponse callExternalService() {
        // Simula una solicitud al servicio externo
        return new ExternalServiceResponse("Datos del servicio externo");
    }
}