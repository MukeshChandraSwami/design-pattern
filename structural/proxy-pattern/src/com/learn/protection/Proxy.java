package com.learn.protection;

import java.util.Set;

public final class Proxy implements Internet {

    private final Set<String> proxiedSites = Set.of("abc.com", "xyz.com");
    private static final Internet REAL = new Real();
    @Override
    public void connect(String host) {
        if(proxiedSites.contains(host))
            System.out.println("Connecting to proxied host:- SecureVerification.com");
        else
            REAL.connect(host);
    }
}
