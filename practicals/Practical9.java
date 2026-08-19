class Rectangle9 { double width=1,height=1; Rectangle9(){} Rectangle9(double w,double h){width=w;height=h;} double getArea(){return width*height;} double getPerimeter(){return 2*(width+height);} }
public class Practical9 { public static void main(String[] a){Rectangle9 r=new Rectangle9(4,5);System.out.println(r.getArea()+" "+r.getPerimeter());} }
