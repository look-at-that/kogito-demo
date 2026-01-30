package it.softwareinside.bff.domain.repository;

import java.util.Optional;

import it.softwareinside.bff.domain.model.ContractRequest;

public interface ContractRequestsRepository {

    Optional<ContractRequest> findByContractId(String contractId);
    ContractRequest saveOrUpdate(ContractRequest request);
}
