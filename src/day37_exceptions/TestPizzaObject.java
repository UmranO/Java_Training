package day37_exceptions;

import day36_polymorphism.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {                   //2 different Pizza objects are allocated in the Heap now

        Pizza pizza1 = new Pizza('S', 2, 3);
        Pizza pizza2 = new Pizza('S', 2, 3);

        System.out.println(pizza1 == pizza2);                 //=>false             //checks if they are the same object

        System.out.println(pizza1.equals(pizza2));            //=>true             //checks if they are equal objects

//----If we pass different objects--------------------------------------------------------------------------------------
/*
        String object:
        System.out.println(pizza1.equals("Pizza"));           //=>Invalid object: String
        boolean
        System.out.println(pizza1.equals(true));              //=>Invalid object: true
        integer
        System.out.println(pizza1.equals(100));               //=>Invalid object: 100
*/
        System.out.println("--------------------------------------------------------------------------");

        Object obj = new Pizza('S', 4, 3); //upcasting

        boolean r = obj.equals(pizza2);                       //=>true
        System.out.println(r);

        double total=((Pizza)obj).calcCost();                //Have to downcast it to object type to call the unique()s
                                                             //of Pizza class-We have to have "Is A Rel" bet.the classes
                                                             //to be able to do downcasting otherwise ClassCastException
        System.out.println(total);

        //double area = ( (Circle)obj ).area();               //=>ClassCastException No rel bet Circle & Pizza classes

        //System.out.println(area);

        System.out.println("Test Completed");

    }
}