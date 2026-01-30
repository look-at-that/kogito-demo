package it.softwareinside.bff.infrastucture.rest;

import it.softwareinside.bff.domain.exception.DraftContractNotFoundException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;

@ApplicationScoped
public class RestExceptionMapper implements ExceptionMapper<DraftContractNotFoundException> {

    @Override
    public Response toResponse(DraftContractNotFoundException exception) {
        throw new NotFoundException("Draft contract with id %s was not found".formatted(exception.getContractId()));
    }


    
}
