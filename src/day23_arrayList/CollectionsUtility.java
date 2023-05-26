package day23_arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {                   //static methods of Collections Utility Class
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8));
//----------max() - returns the max element of a Collection/an ArrayList------------------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");
        int max = Collections.max(list);
        System.out.println("max = " + max);                                //=>max = 8

//----------min() - returns the min element of a Collection/an ArrayList------------------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");
        int min = Collections.min(list);
        System.out.println("min = " + min);                               //=>min = 1


//----------sort() - sorts the Collection/an ArrayList in Ascending Order-----------------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");

        ArrayList<String>  items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));

        Collections.sort(items);                     //Sorts in the Ascending order. From A to Z

        System.out.println(items);  //=>[Blueberry, Eggs, Milk, Orange, Paper towels, Potato, Rice, Strawberry, Tomato]

//----------reverse() - reverses Collection/an ArrayList in the opposite order------------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");

        Collections.reverse(items);
        System.out.println(items); //=>[Tomato, Strawberry, Rice, Potato, Paper towels, Orange, Milk, Eggs, Blueberry]

//----------swap() - changes the places of 2 elements in the Collection/an ArrayList in the opposite order--------------
System.out.println("-------------------------------------------------------------------------------------------------");

ArrayList<String> students = new ArrayList<>();

        students.addAll(  Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal" )   );
        System.out.println(students);                                           //=> [Gadir, Hasan, Abidullah, Bilal]

        Collections.swap(students, 0 , 1);
        System.out.println(students);                                           //=> [Hasan, Gadir, Abidullah, Bilal]

        Collections.swap(students, 0, students.size()-1);
        System.out.println(students);                                           //=> [Bilal, Gadir, Abidullah, Hasan]
    }
}
