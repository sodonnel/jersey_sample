package com.sodonnell.jerseySample;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class RootService {

  @Inject
  AppSingleton myapp;

  @GET
  @Path("{clientName}")
  @Produces(MediaType.TEXT_PLAIN)
  public Response greetClient(@PathParam("clientName") String name) {
    String output = "Hi from root" + name;
    myapp.printMsg();
    return Response.status(200).entity(output).build();
  }
}
