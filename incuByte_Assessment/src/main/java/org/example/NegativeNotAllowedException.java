package org.example;

public class NegativeNotAllowedException  extends Exception {
    public NegativeNotAllowedException() {
        super("Negative Not Allowed");
    }
    public NegativeNotAllowedException(String msg) {
        super("Negative Not Allowed and numbers are "+msg);
    }
}