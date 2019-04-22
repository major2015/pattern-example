package com.iblog.pattern.singleton;

import java.io.Serializable;

public class StaticClassSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static class LazyHolder {
        private static final StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }

    private StaticClassSingleton() {}

    public static StaticClassSingleton get() {
        return LazyHolder.INSTANCE;
    }
}
