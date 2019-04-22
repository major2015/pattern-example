package com.iblog.pattern.singleton;

import java.io.Serializable;

public class Demo2Singleton implements Serializable {
    private volatile static Demo2Singleton instance = null;

    public static Demo2Singleton get() {
        if (instance == null) {
            instance = new Demo2Singleton();
        }
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
