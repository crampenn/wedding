package com.jamespennell.wedding.views;

import io.dropwizard.views.View;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class HelloView extends View {

	private final String message;

	public HelloView(final String message) {
		super("hello.mustache");
		this.message = message;
	}

}
