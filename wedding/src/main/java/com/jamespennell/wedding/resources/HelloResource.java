package com.jamespennell.wedding.resources;

import com.jamespennell.wedding.views.HelloView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class HelloResource {

	@GET
	public HelloView get() {
		return new HelloView("Hello, World!");
	}

}
