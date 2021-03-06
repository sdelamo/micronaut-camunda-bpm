package info.novatec.micronaut.camunda.bpm.feature.webapp;

import org.camunda.bpm.welcome.impl.web.WelcomeApplication;
import org.glassfish.jersey.server.ResourceConfig;

/***
 * @author Martin Sawilla
 */
public class WelcomeApp extends ResourceConfig {

    protected static final WelcomeApplication welcomeApplication = new WelcomeApplication();

    public WelcomeApp() {
        registerClasses(welcomeApplication.getClasses());
        // Disable WADL-Feature because we do not want to expose a XML description of our RESTful web application.
        property("jersey.config.server.wadl.disableWadl", "true");
    }

}
