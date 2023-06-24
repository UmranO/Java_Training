package day31_inheritance.shape_methodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);
        square.draw();

        System.out.println("-------------------------------------------------------");

        Circle circle = new Circle(5.0);
        System.out.println(circle);
        circle.draw();

        System.out.println("-------------------------------------------------------");

        Rectangle rec1=new Rectangle(5,3);
        System.out.println(rec1);
        System.out.println(rec1.area());
        System.out.println(rec1.perimeter());
        rec1.draw();

        System.out.println("-------------------------------------------------------");
        Triangle tri1=new Triangle(10.0,4);
        System.out.println(tri1);
        System.out.println(tri1.area());
        System.out.println(tri1.perimeter());
        tri1.draw();


    }
}
