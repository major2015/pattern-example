package com.iblog.pattern.singleton;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class Demo2SingletonTest {
    private Demo2Singleton instanceOne = Demo2Singleton.get();

    @Test
    public void testReadSolve() throws Exception {

        // Serialize to a file
//        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
//                "filename.ser"));
//        out.writeObject(instanceOne);
//        out.close();

        instanceOne.setValue(20);

        // Serialize to a file
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        Demo2Singleton instanceTwo = (Demo2Singleton) in.readObject();
        in.close();

        assertNotEquals(instanceOne.toString(), instanceTwo.toString());
        assertEquals(20, instanceOne.getValue());
        assertEquals(10, instanceTwo.getValue());

    }

}