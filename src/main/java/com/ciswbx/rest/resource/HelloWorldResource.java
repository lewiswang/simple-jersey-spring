package com.ciswbx.rest.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Intellij Idea
 * Created by gonwang on 2016/6/14.
 */

//@Component
@Path("/helloWorld")
public class HelloWorldResource {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Response helloWorld() {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setContent("Hello World!");

        return Response.status(Response.Status.OK).entity(helloWorld).build();
    }
}
