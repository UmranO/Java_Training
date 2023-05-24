package day23_arrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args){

//----------editing an element of an Array-----------------------------------------------------------------------------
int[] array= {1,2,3,4,5};
array[0]=100;
        System.out.println(Arrays.toString(array));

//----------set() - updating an element of an ArrayList-----------------------------------------------------------------
//----------has to be done by a method----------------------------------------------------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

        groceriesList.set(2,"Oranges");        //set() is used to update the element at index 2 (Apples to Oranges)
        System.out.println(groceriesList);     //2 arguments should be given:
                                               //index# of the elem. we want to change and the new elem. should be given

        groceriesList.add(2,"Chicken"); //add() increases the size but set() only updates the element
        System.out.println(groceriesList);

//----------remove() - removes an element of the ArrayList--------------------------------------------------------------
//----------can remove by the index # or by the object & returns boolean -----------------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");
//---------remove() from an ArrayList of String

        groceriesList.remove(0);                                //remove an element by passing int primitive
        System.out.println(groceriesList);

        groceriesList.remove("Cooking oil");
        System.out.println(groceriesList);

//---------remove() from an ArrayList of  Integers                    //remove an element by passing int primitive

        ArrayList<Integer> numbers=new ArrayList<> ();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4

        boolean r1= numbers.remove(Integer.valueOf(10));
        System.out.println(numbers);
        System.out.println(r1);

//----------clear() - removes all the elements of the ArrayList---------------------------------------------------------
//----------means setting the size to zero ------------------------------------------------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");

       numbers.clear();
       System.out.println(numbers);
       numbers.size();
       System.out.println(numbers.size());

//----------indexOf() - returns the index # of the 1st matching elem.from left (beginning) to right of the ArrayList----
//----------has the same function as the indexOf() of the String Class & return type:int--------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");
        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");  //0
        names.add("Vasyl");  //1
        names.add("Sumeye"); //2
        names.add("Sumeye"); //3
        names.add("Ali");    //4
        names.add("Sumeye"); //5

        System.out.println(  names.indexOf("Vasyl") );                  //Console:0
        System.out.println( names.lastIndexOf("Vasyl") );            //Console:1 bec last time this elem seen in this
                                                                        //ArrayList is at index: 1


//----------lastIndexOf() - returns the index # of the last matching elem.of the ArrayList
//----------has the same function as the lastIndexOf() of the String Class & return type:int----------------------------
System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println( names.lastIndexOf("Vasyl") );            //Console:1
        System.out.println( names.lastIndexOf("Sumeye") );           //Console:5   Sondan bakiyor ama index bastan
    }
}
