package com.learn.protection;

public class MainProtectionProxy {

    public static void main(String[] args) {
        Internet i = new Proxy();
        i.connect("abc.com");
        i.connect("cvent.com");
    }
}
