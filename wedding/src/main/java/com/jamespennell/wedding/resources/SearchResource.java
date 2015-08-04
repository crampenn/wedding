package com.jamespennell.wedding.resources;

import com.jamespennell.wedding.views.SearchView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/search")
@Produces(MediaType.TEXT_HTML)
public class SearchResource {

	@GET
	public SearchView get(@QueryParam("q") final String query) {
		return new SearchView(query);
	}

}
