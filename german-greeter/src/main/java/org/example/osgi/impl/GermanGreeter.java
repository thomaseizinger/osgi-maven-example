package org.example.osgi.impl;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.example.osgi.api.Greeter;

@Component
@Service
public class GermanGreeter implements Greeter {
    public void greet(String name) {
        System.out.println("Hallo " + name);
    }
}
