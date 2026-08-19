package bpack;

import apack.A;

public class B extends A {
    public B() {
        super(1, 2, 3);
    }

    public void display() {
        System.out.println("Inheritance: public=" + pubVar + ", protected=" + protVar + "; private is inaccessible");
    }
}
