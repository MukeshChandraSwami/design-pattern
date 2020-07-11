package com.learn;

public class NameIterator implements Iterator {

    private String[] names;
    private int index;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return this.index < names.length;
    }

    @Override
    public Object next() {
        if(this.hasNext())
            return this.names[this.index++];
        return null;
    }
}
