package com.learn;

import java.util.function.Consumer;

public class NameRepo {

    private String []str;

    public NameRepo(String[] names) {
        this.str = names;
    }

    public void forEach(Consumer<String> consumer) {
        for(String s : str) {
            consumer.accept(s);
        }
    }
}
