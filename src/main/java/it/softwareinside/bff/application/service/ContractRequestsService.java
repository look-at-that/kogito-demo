package it.softwareinside.bff.application.service;

import java.util.UUID;

import it.softwareinside.bff.domain.exception.RequestChecksFailedException;
import it.softwareinside.bff.domain.model.ContractRequest;
import it.softwareinside.bff.domain.repository.ContractRequestsRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ContractRequestsService {

    @Inject
    ContractRequestsRepository repository;


    @Transactional
    public ContractRequest createContractRequest(ContractRequest request) {
        request.setContractId(UUID.randomUUID().toString());
        repository.saveOrUpdate(request);
        return request;
    }

}
