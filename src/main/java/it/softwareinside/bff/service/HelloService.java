package it.softwareinside.bff.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;

@ApplicationScoped
public class HelloService {


    public String sayHello() {
        return "Hello";
    }
}
