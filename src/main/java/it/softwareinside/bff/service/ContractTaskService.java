package it.softwareinside.bff.service;

import io.quarkus.logging.Log;
import it.softwareinside.bff.model.ContractTask;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Map;

@ApplicationScoped
public class ContractTaskService {

    private Map<String, ContractTask> contractTaskMap = Map.of(
            "ORD001", new ContractTask("ORD001", "Ennio Narbona")
    );

    public ContractTask createContactTask(String contractId) {
        Log.infov("Retrieving contract task from id {0}", contractId);
        var contactTask = contractTaskMap.get(contractId);
        if(contactTask == null)
            throw new ContractTaskNotFoundException(contractId);

        Log.infov("Loaded contract task {0}", contactTask);
        return contactTask;
    }
}
