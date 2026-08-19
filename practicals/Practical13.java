class Rectangle13 {
    double width, height;

    Rectangle13(double w, double h) {
        width = w;
        height = h;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    void show() {
        System.out.printf("w=%.1f h=%.1f area=%.2f perimeter=%.2f%n", width, height, area(), perimeter());
    }
}

public class Practical13 {
    public static void main(String[] a) {
        Rectangle13 r1 = new Rectangle13(4, 40), r2 = new Rectangle13(3.5, 35.9);
        r1.show();
        r2.show();
        System.out.println(r1.area() > r2.area() ? "Rectangle 1 is larger" : "Rectangle 2 is larger");
    }
}
