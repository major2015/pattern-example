package com.iblog.pattern.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProtoTypeFactoryTest {

    @Test
    public void getInstance() throws CloneNotSupportedException {
        Movie instance = (Movie) ProtoTypeFactory.getInstance(ProtoTypeFactory.ModelType.MOVIE);
        instance.setName("1");
        Movie instance2 = (Movie) ProtoTypeFactory.getInstance(ProtoTypeFactory.ModelType.MOVIE);
        instance2.setName("2");
        assertEquals("1", instance.getName());
        assertEquals("2", instance2.getName());
    }
}