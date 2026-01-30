package it.softwareinside.bff.infrastucture.repository.mongo.entity;

import java.math.BigDecimal;
import java.util.Optional;

import org.bson.codecs.pojo.annotations.BsonProperty;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "bff_draft_contracts")
public class MongoDraftContractEntity extends PanacheMongoEntity {

    @BsonProperty("contract_id")
    public String contractId;

    @BsonProperty("maximum_amount")
    public BigDecimal maximumAmount;

    @BsonProperty("transferor_name")
    public String transferorCompanyName;


    public static Optional<MongoDraftContractEntity> findByContractId(String contractId) {
        return find("contractId", contractId).firstResultOptional();
    }


}
