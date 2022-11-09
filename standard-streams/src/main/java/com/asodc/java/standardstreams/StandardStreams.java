package com.asodc.java.standardstreams;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardStreams {
    public static void main(String... args) {
        // by default, standard output is usually the console
        System.out.println("THIS IS THE STANDARD OUTPUT STREAM, WHICH IS USUALLY THE CONSOLE!");

        // redirect standard output to something else
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
        System.out.println("YOU WON'T SEE THIS IN THE CONSOLE AS STANDARD OUTPUT HAS BEEN REDIRECTED!");

        // redirect standard output again
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.println("YOU SHOULD BE ABLE TO SEE THIS IN THE CONSOLE!");
    }
}
