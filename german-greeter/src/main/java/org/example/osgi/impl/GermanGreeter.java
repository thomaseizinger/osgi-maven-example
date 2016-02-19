package org.example.osgi.impl;

import org.example.osgi.api.Greeter;
import org.osgi.service.component.annotations.Component;

@Component
public class GermanGreeter implements Greeter {
    public void greet(String name) {
        System.out.println("Hallo " + name);
    }
}
