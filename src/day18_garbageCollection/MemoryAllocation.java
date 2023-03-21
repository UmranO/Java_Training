package day18_garbageCollection;
import day17_customClass.Employee;

class Car{                                             //2nd class-No public keyword bec in Java rule for creating
                                                       //multiple classes in 1 file is: There can only public Class &
    public String brand;                               //the public class we have has to match with the file name
    public String model;                               //No memory allocation for this class-Memory allocation will only
    public String color;                               //created when we create an object.
    public int year;                                   //default value for int primitives will be zero
}                                                      //All those instances will also be allocated in the heap along
                                                       //with the Car object
//--------------------------------------------------------------------------------------------------------------------
public class MemoryAllocation {                       //2 class which has the same name as the file can have public so
                                                      //this one has public keyword.
    public static void main(String[] args) {          //main() will be allocated in Stack when we creat it.

        int a = 100;                                  //variable a is a local var. & referencing to 100 which is int &
                                                      // a primitive and its value 100 will be allocated in stack when
                                                      //this app(MemoryAllocation) runs.
        Car car   =  new Car();                       //in this memory allocation for this new object in the heap brand,
        //  stack      heap                           //model & color of this object will be null bec default value for
                                                      //non-primitives will be null
        System.out.println("-----------------------------------------");

        Employee employee1 = new Employee();
        Employee employee2 = employee1;
        employee1.setInfo("Rehane", 30, 'F', "Java Developer",95000, "A12");
        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("-----------------------------------------");

        String batch1 = new String("Java");              //batch1: non-primitive local variable
        String batch2 = batch1;
        String batch3 = batch1;
    }

    public static void method1(){                               //method1() allocated in Stack

        int b = 200; // stack                                   //b:is a local variable which has a primitive value
                                                                //so b & its primitive value will be allocated in Stack
    }

    public static void method2(){                              //method2() allocated in Stack

        String  c  =  "Hello World";                           //c:is a local variable with non-primitive value (object)
        //    stack       heap (String Pool)                   //So it's also a ref variable. c goes to Stack but
                                                               //Object goes to Heap

        String  d   =  new String("Hello World") ;     //d:is a local variable with non-primitive value
        //     stack         heapc goes to heap but            //d goes to Stack but Object goes to Heap

    }
}