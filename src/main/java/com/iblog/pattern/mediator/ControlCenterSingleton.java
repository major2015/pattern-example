package com.iblog.pattern.mediator;

public class ControlCenterSingleton {

    private static class LazyLoader {
        private static final IControl control = new ControlCenter();
    }

    public static IControl get() {
        return LazyLoader.control;
    }
}
