package com.learn.protection;

public sealed interface Internet permits Proxy, Real {

    void connect(String host);
}
