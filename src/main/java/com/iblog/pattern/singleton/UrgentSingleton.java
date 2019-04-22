package com.iblog.pattern.singleton;

public class UrgentSingleton {

    private static volatile UrgentSingleton INSTANCE = new UrgentSingleton();

    /** private constructor */
    private UrgentSingleton() {}

    public static UrgentSingleton get() {
        return INSTANCE;
    }
}
