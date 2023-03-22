package day18_garbageCollection;
import day17_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

        // new GarbageCollection().finalize();

        String s1 = "Java";
        s1 = null; // "Java" will be eligible for garbage collection

        System.out.println(s1);

        //  System.out.println(s1.toUpperCase());                  //NullPointerException bec. it is null

        //  System.out.println( s1.replace(null, "Python"));       //NullPointerException bec. it is null

        String a = "";                                             //Empty String is an object but null is not
        String b = null;

        System.out.println("-------------------------------------------");

        String str1 = "Python";    //During runtime"Python will be allocated in heap but str1 will be allocated in Stack
        str1 = "CYDEO";            //"Python" will be unreferanced after line 24 & elligible for GCollection

        System.out.println(str1);


        System.out.println("-------------------------------------------");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow chow", 'M', 3, "Medium", "Black");


        Dog dog2 = new Dog();
        dog2.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");

        dog1 = dog2;


        System.out.println(dog1);
        System.out.println(dog2);


        // new Dog().finalize();



    }

}