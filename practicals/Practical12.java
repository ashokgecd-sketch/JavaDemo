class Point12 {
    int x, y;

    Point12() {
        x = y = 5;
    }

    Point12(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point12(Point12 p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class Practical12 {
    public static void main(String[] a) {
        new Point12().display();
        Point12 p = new Point12(2, 3);
        p.display();
        new Point12(p).display();
    }
}
