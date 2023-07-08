package day37_exceptions;

public class TestPizzaObject {
    public static void main(String[] args) {                   //2 different Pizza objects are allocated in the Heap now

        Pizza pizza1 = new Pizza('S', 2, 3);
        Pizza pizza2 = new Pizza('S', 2, 3);

        System.out.println(pizza1 == pizza2);                 //=>false             //checks if they are the same object

        System.out.println(pizza1.equals(pizza2));            //=>true             //checks if they are equal objects

//----If we pass different objects--------------------------------------------------------------------------------------

        //String object:
        System.out.println(pizza1.equals("Pizza"));          //=>Invalid object: String
        //boolean
        System.out.println(pizza1.equals(true));              //=>Invalid object: true
        //integer
        System.out.println(pizza1.equals(100));              //=>Invalid object: 100
    }
}