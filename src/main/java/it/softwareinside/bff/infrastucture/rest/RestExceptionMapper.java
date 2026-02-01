package it.softwareinside.bff.infrastucture.rest;

import org.jbpm.workflow.instance.WorkflowRuntimeException;

import it.softwareinside.bff.domain.exception.RequestChecksFailedException;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@ApplicationScoped
@Provider
@Priority(1)
public class RestExceptionMapper implements ExceptionMapper<WorkflowRuntimeException> {

    @Override
    public Response toResponse(WorkflowRuntimeException exception) {
        var cause = exception.getCause();

        if(cause instanceof RequestChecksFailedException) {
            return Response.status(400).entity(
                ((RequestChecksFailedException)cause).getErrors()
            ).build();
        }

        return Response.serverError().entity(exception.getMessage()).build();
        
    }


    
}
