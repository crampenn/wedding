package com.jamespennell.wedding.views;

import io.dropwizard.views.View;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class SearchView extends View {

	private final String query;

	public SearchView(final String query) {
		super("search.mustache");
		this.query = query;
	}

}
