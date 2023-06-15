package day27_accessModifiers;

public class Car {                                                  //outer Class

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine{                                       //inner Class

        public void method(){                                     //if the inner class is not static it can access all
                                                                  //the members of the outer Class
            System.out.println(make);                             //either instance variable of the outer Class OR
            System.out.println(wheels);                           //either static variable of the outer Class

        }

    }
}
