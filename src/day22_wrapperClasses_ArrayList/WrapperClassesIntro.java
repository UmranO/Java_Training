package day22_wrapperClasses_ArrayList;
public class WrapperClassesIntro {

    public static void main(String[] args) {

        String str = "Java";         //For String no need to have an import statement bec. it is from java.lang package

        int a1 = 10;
        Integer a2 = 10;             //Wrapper class variable a2 can be used in Data Structures other than Array.

        System.out.println("-----------------------------------");

        int b1 = 100;               //int can directly be assigned to double & long bec it will implicitly be casted

        double c1 = b1;
        long c2 = b1;

        Integer b2 = b1;        //Autoboxing        //But each primitive has to be autoboxed into its dedicated class
        //  Long b3 = (long)b1;                     //we can cast and assign but no point of doing an extra step
        //  Double b4 = b1;                         //int can not be autoboxed into a double.

        char ch = 'A';

        Character ch2 = ch;    //Autoboxing

        double d1 = 5.5;

        Double d2 = d1;        //Autoboxing

        System.out.println("-----------------------------------");

        Integer n1 = 20;                    //The primitive of Integer Wrapper Class is int
        int n2 = n1;                        //unboxing
                                            //As soon as you try to convert any wrapper class to its primitive
        //    long n3 = n1;                 wrapper class object will be converted to its own primitive value-here int
        //    double n4 =n1;                so if you have int you can assign it to long or double directly! so those
                                            //wrapper classes you can assign directly to other primitives as long as the
        Character e1 = 'Z';                 //other primitive has a greater range. Even though these don't give error it
                                            //is still best to convert it to its own primitive
        char e2 =e1;         //Unboxing
                                            //So when we work with Data Structures we can directly give primitives, it
                                            //will conver it for us.
        // int e3 = e1;                     //Since every character has a # so we can assign this Character to int or
        // long e4 = e1;                    //long.But we shouldn't convert it int or long (other primitive other than
                                            //its own) bec the value will be changed completely bec it will no longer be
                                            //a Character, it will be a number. So even for unboxing we better use its
                                            //own primitive

    }

}