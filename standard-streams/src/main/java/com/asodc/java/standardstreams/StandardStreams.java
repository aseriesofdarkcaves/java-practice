package com.asodc.java.standardstreams;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardStreams {
    public static void main(String... args) {
        System.out.println("BEFORE!");
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
        System.out.println("AFTER!");
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.println("ANOTHER AFTER!");
    }
}
