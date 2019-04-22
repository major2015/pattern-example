package com.iblog.pattern.singleton;

public class LazySingleton {
    private static volatile LazySingleton INSTANCE = null;

    private LazySingleton() {}

    public static LazySingleton get() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) { // double check
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
