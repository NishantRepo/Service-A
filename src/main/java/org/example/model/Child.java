package org.example.model;

public class Child extends Parent {
    public void add() throws RuntimeException {
        System.out.println("Child");
    }

    public static void sum() {
        System.out.println("static child.");
    }
}

