package com.asodc.java.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTests {
    @Test
    public void checkOutputStream() {
        // redirect standard out from console to a ByteArrayOutputStream for capture
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // call the program under test
        HelloWorld.main(new String[]{});

        // assertions
        final boolean streamContainsExpectedString = outputStream.toString().contains(HelloWorld.GREETING);

        Assertions.assertTrue(streamContainsExpectedString, "The output was not as expected...");
    }
}
