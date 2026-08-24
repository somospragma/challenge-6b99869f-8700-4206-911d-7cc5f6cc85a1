package com.example.externalservice.application;

import com.example.externalservice.domain.ExternalServiceResponse;
import com.example.externalservice.infrastructure.ExternalServiceClient;
import com.example.externalservice.infrastructure.ThreadExecutor;
import com.example.externalservice.application.ExternalServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExternalService {

    @Autowired
    private ExternalServiceClient externalServiceClient;

    @Autowired
    private ThreadExecutor threadExecutor;

    public ExternalServiceResponse callExternalService() {
        try {
            return threadExecutor.execute(() -> externalServiceClient.callExternalService());
        } catch (Exception e) {
            throw new ExternalServiceException("Error calling external service", e);
        }
    }
}