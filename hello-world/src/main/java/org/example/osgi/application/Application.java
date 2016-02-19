package org.example.osgi.application;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.example.osgi.api.Greeter;

@Component
public class Application {

    @Reference
    private Greeter greeter;

    @Activate
    private void start() {
        greeter.greet("Thomas");
    }
}
