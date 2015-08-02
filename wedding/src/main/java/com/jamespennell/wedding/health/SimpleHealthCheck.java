package com.jamespennell.wedding.health;

import com.hubspot.dropwizard.guice.InjectableHealthCheck;

public class SimpleHealthCheck extends InjectableHealthCheck {

	@Override
	public String getName() {
		return "simple";
	}

	@Override
	protected Result check() throws Exception {
		return Result.healthy();
	}

}
