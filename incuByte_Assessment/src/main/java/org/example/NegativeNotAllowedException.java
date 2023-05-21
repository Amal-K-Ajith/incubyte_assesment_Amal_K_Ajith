package org.example;

public class NegativeNotAllowedException  extends Exception {
    public NegativeNotAllowedException() {
        super("Negative Not Allowed");
    }
}