package com.teedjay;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    Template webpage;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance hello() {
        return webpage.data("name", "teedjay");
    }

}
