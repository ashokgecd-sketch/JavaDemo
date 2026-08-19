class Shape22 {
    double d1, d2;

    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}

class Triangle22 extends Shape22 {
    double area() {
        return d1 * d2 / 2;
    }
}

class Rectangle22 extends Shape22 {
    double area() {
        return d1 * d2;
    }
}

public class Practical22 {
    public static void main(String[] a) {
        Triangle22 t = new Triangle22();
        t.getData(10, 5);
        Rectangle22 r = new Rectangle22();
        r.getData(10, 5);
        System.out.println("Triangle: " + t.area() + ", Rectangle: " + r.area());
    }
}
