package com.iblog.pattern.singleton;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class DemoSingletonTest {
    private DemoSingleton instanceOne = DemoSingleton.get();

    @Test
    public void testReadSolve() throws Exception {

        // Serialize to a file
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        instanceOne.setValue(20);

        // Serialize to a file
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        DemoSingleton instanceTwo = (DemoSingleton) in.readObject();
        in.close();

        assertEquals(instanceOne.toString(), instanceTwo.toString());
        assertEquals(instanceOne.getValue(), instanceTwo.getValue());

    }

}