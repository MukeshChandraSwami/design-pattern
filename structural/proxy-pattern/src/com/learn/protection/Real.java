package com.learn.protection;

public final class Real implements Internet {

    @Override
    public void connect(String host) {
        System.out.println("Connecting to:- " + host);
    }
}
