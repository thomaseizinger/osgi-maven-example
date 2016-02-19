package org.example.osgi.application;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;

@Component
public class Application {

    @Activate
    private void start() {
        throw new RuntimeException();
    }
}
