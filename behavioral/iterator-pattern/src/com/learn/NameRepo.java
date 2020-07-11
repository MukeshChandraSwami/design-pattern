package com.learn;

public class NameRepo {

    private Iterator nameIterator;

    public NameRepo(String[] names) {
        this.nameIterator = new NameIterator(names);
    }

    public Iterator getNameIterator() {
        return nameIterator;
    }
}
