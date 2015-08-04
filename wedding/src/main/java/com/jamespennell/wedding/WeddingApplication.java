package com.jamespennell.wedding;

import com.bazaarvoice.dropwizard.assets.ConfiguredAssetsBundle;
import com.hubspot.dropwizard.guice.GuiceBundle;
import com.jamespennell.wedding.health.SimpleHealthCheck;
import com.jamespennell.wedding.resources.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.bundles.version.VersionBundle;
import io.dropwizard.bundles.version.suppliers.MavenVersionSupplier;
import io.dropwizard.forms.MultiPartBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public class WeddingApplication extends Application<WeddingConfiguration> {

	@Override
	public void run(final WeddingConfiguration weddingConfiguration, final Environment environment) throws Exception {

	}

	@Override
	public void initialize(final Bootstrap<WeddingConfiguration> bootstrap) {
		super.initialize(bootstrap);
		final GuiceBundle<WeddingConfiguration> guice = GuiceBundle.<WeddingConfiguration>newBuilder()
				.setConfigClass(WeddingConfiguration.class)
				.enableAutoConfig(HelloResource.class.getPackage().getName(),
						SimpleHealthCheck.class.getPackage().getName())
				.addModule(new WeddingModule())
				.build();
		bootstrap.addBundle(guice);
		bootstrap.addBundle(new VersionBundle(new MavenVersionSupplier("com.jamespennell", "wedding")));
		bootstrap.addBundle(new ViewBundle<>());
		bootstrap.addBundle(new ConfiguredAssetsBundle("/assets/", "/assets/"));
		bootstrap.addBundle(new MultiPartBundle());
	}

	public static void main(final String[] args) throws Exception {
		new WeddingApplication().run(args);
	}

}
