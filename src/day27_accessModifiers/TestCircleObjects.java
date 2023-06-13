package day27_accessModifiers;

public class TestCircleObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

//        System.out.println(circle1.pi);                   //All these 3 lines will print the same value:3.14
//        System.out.println(circle2.pi);
//        System.out.println(circle3.pi);                   //statics can be called from an object but not preferred

        System.out.println(Circle.pi);                      //proper way to call a static is from te Class name


    }
}
