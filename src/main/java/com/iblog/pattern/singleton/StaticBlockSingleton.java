package com.iblog.pattern.singleton;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("StaticBlockSingleton init exception:", e);
        }
    }

    private StaticBlockSingleton() {}

    public static StaticBlockSingleton get() {
        return INSTANCE;
    }
}
