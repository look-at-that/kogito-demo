package it.softwareinside.bff.domain.repository;

import java.util.Optional;

import it.softwareinside.bff.domain.model.DraftContract;

public interface DraftContractsRepository {
    Optional<DraftContract> findByContractId(String contractId);
}
