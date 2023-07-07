package day36_polymorphism;

public class TestEqualMethod {
    public static void main(String[] args) {

            Circle circle1 = new Circle(5);

            Circle circle2 = new Circle(5);

            Circle circle3 = new Circle(15);

            System.out.println(circle1 == circle2);               //false bec. == compares the memory allocations of
                                                                  //those 2 objects. They are not the same so
                                                                  //allocated in 2 different allocation in Heap memory

                                                                  //To compare 2 objects we need to call equals()
            System.out.println( circle1.equals(circle2) );        //true
            System.out.println (circle1.equals(circle3) );        //false

        System.out.println("----------------------------------------------------------");

        IPhone iphone1 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);

        IPhone iphone2 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);

        System.out.println( iphone1.equals(iphone2) );

        System.out.println("----------------------------------------------------------");

        Square s1=new Square(5.0);
        Square s2=new Square(5.0);
        System.err.println(s1.equals(circle1));

    }
}
