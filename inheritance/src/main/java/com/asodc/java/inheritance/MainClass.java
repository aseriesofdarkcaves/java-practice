package com.asodc.java.inheritance;

public class MainClass {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(parent.getLogger());
        System.out.println(child.getLogger());
    }
}
