package com.learn;

public class MySqlDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting My-Sql Database");
    }

    @Override
    public void disConnect() {
        System.out.println("Disconnecting My-Sql Database");
    }
}
