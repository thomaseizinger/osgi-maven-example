package org.example.osgi.application;

import org.example.osgi.api.Greeter;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class Application {

    @Reference
    private Greeter greeter;

    @Activate
    private void start() {
        greeter.greet("Thomas");
    }
}
