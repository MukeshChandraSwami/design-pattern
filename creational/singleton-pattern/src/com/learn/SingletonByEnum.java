package com.learn;

import java.io.Serializable;

public enum SingletonByEnum implements Cloneable, Serializable {

    SINGLETON;

    public Source createSource() {
        return new Source("Mukesh", "10000");
    }
}
