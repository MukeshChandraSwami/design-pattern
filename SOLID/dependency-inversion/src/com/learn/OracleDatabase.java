package com.learn;

public class OracleDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting Oracle Database");
    }

    @Override
    public void disConnect() {
        System.out.println("Disconnecting Oracle Database");
    }
}
