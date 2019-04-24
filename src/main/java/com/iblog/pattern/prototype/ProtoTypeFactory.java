package com.iblog.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class ProtoTypeFactory {
    public static class ModelType {
        public static final String MOVIE = "Movie";
        public static final String ALBUM = "Album";
        public static final String SHOW = "Show";
    }

    private static Map<String, ProtoTypeCapable> protoTypes = new HashMap<>();

    static {
        protoTypes.put(ModelType.MOVIE, new Movie());
        protoTypes.put(ModelType.ALBUM, new Album());
        protoTypes.put(ModelType.SHOW, new Show());
    }

    public static ProtoTypeCapable getInstance(final String type) throws CloneNotSupportedException {
        return protoTypes.get(type).clone();
    }
}
