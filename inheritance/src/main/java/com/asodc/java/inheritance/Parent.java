package com.asodc.java.inheritance;

public class Parent {
    /**
     * Class field which contains the canonical name of the currently instanciated class.
     */
    private final String logger = this.getClass().getCanonicalName();

    protected String getLogger() {
        return logger;
    }
}
