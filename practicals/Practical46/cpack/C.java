package cpack;

import apack.A;

public class C {
    public void display() {
        A a = new A(1, 2, 3);
        System.out.println("Object access: public=" + a.pubVar + "; protected/private are inaccessible");
    }
}
