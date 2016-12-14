package com.jepl;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.internal.scanning.PackageNamesScanner;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class ApplicationConfiguration extends ResourceConfig {

    public ApplicationConfiguration() {
        super();

        PackageNamesScanner resourceFinder = new PackageNamesScanner(new String[]{"com.jepl.resources"}, true);
        registerFinder(resourceFinder);
        register(JacksonFeature.class);
    }
}