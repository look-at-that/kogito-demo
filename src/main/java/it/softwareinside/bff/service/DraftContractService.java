package it.softwareinside.bff.service;

import io.quarkus.logging.Log;
import it.softwareinside.bff.model.DraftContract;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Map;

@ApplicationScoped
public class DraftContractService {

    private Map<String, DraftContract> contractTaskMap = Map.of(
            "ORD001", new DraftContract("ORD001", "Ennio Narbona")
    );

    public DraftContract createContactTask(String contractId) {
        Log.infov("Retrieving contract task from id {0}", contractId);
        var contactTask = contractTaskMap.get(contractId);
        if(contactTask == null)
            throw new DraftContractNotFoundException(contractId);

        Log.infov("Loaded contract task {0}", contactTask);
        return contactTask;
    }
}
