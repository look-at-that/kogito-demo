package it.softwareinside.bff.infrastucture.repository.mongo;

import java.util.Optional;

import it.softwareinside.bff.domain.model.ContractRequest;
import it.softwareinside.bff.domain.repository.ContractRequestsRepository;
import it.softwareinside.bff.infrastucture.repository.mongo.entity.MongoContractRequestEntity;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MongoContractRequestsRepository implements ContractRequestsRepository {

    @Override
    public Optional<ContractRequest> findByContractId(String contractId) {
        return MongoContractRequestEntity.findByContractId(contractId)
                .map(this::toModel);
    }


    ContractRequest toModel(MongoContractRequestEntity entity) {
        var request = new ContractRequest();
        request.setContractId(entity.contractId);
        request.setMaximumAmount(entity.maximumAmount);
        request.setTransferorCompanyName(entity.transferorCompanyName);
        return request;
    }


    MongoContractRequestEntity fromModel(ContractRequest model) {
        var request = new MongoContractRequestEntity();
        request.contractId = model.getContractId();
        request.maximumAmount = model.getMaximumAmount();
        request.transferorCompanyName = model.getTransferorCompanyName();
        return request;
    }

    public ContractRequest saveOrUpdate(ContractRequest request) {
        MongoContractRequestEntity.findByContractId(request.getContractId())
            .ifPresent(MongoContractRequestEntity::delete);
  
        fromModel(request).persist();
        return request;
    }

}
