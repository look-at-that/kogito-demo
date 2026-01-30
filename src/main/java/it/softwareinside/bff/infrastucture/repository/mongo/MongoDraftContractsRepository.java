package it.softwareinside.bff.infrastucture.repository.mongo;

import java.util.Optional;

import it.softwareinside.bff.domain.model.DraftContract;
import it.softwareinside.bff.domain.repository.DraftContractsRepository;
import it.softwareinside.bff.infrastucture.repository.mongo.entity.MongoDraftContractEntity;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MongoDraftContractsRepository implements DraftContractsRepository {

    @Override
    public Optional<DraftContract> findByContractId(String contractId) {
        return MongoDraftContractEntity.findByContractId(contractId)
                .map(this::toModel);
    }


    DraftContract toModel(MongoDraftContractEntity entity) {
        var draft = new DraftContract();
        draft.setContractId(entity.contractId);
        draft.setMaximumAmount(entity.maximumAmount);
        draft.setTransferorCompanyName(entity.transferorCompanyName);
        return draft;
    }

}
