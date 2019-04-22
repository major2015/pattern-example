package com.iblog.pattern.singleton;

import java.io.Serializable;

public class DemoSingleton implements Serializable {
    private volatile static DemoSingleton instance = null;

    public static DemoSingleton get() {
        if (instance == null) {
            instance = new DemoSingleton();
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    private int value = 10;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
