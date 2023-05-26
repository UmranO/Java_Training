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

//----------contains() - returns true or false
//----------checking a specified element is present in the ArrayList or not & return type:boolean-----------------------
        System.out.println("-----------------------------------------------------------------------------------------");

        boolean hasMuhtar=names.contains("Muhtar");    //=>false
        System.out.println("hasMuhtar = " + hasMuhtar);

        boolean hasAli=names.contains("Ali");          //=>false
        System.out.println("hasAli = " + hasAli);

//----------equals() - return type:boolean--returns true or false
//----------checking if 2 ArrayLists have the same elements and if those elements are in the same order ----------------
System.out.println("-------------------------------------------------------------------------------------------------");

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=list1;                 //Only 1 ArrayList object is created in the Heap memory and this
                                                        //object is being shared by 2 referance variables: list1 & list2
       list1.add(10);                                   //These ref.variables are in the stack and both calling the same
                                                        //ArrayList object. So when we add 10 to one it is also added to
        System.out.println(list1==list2);               //the other. That's why =>true BUT
                                                        //below 2 objects are created in 2 diff.locations in Heap Memory
            //------------------------------

       ArrayList<Integer> l1=new ArrayList<>();
       ArrayList<Integer> l2=new ArrayList<>();

       l1.add(10);                                      //Since different objects when we add 10 to one it won't be
                                                        //added to the second ArrayList object
        System.out.println(l1==l2);                     //=>false & the second ArrayList is empty
        System.out.println(l2);                         //=>[]   (Empty ArrayList)

       l2.add(10);
       //Even though they are not the same objects we might want to check 1)if they have the same elements & 2)if those
       //elements are in the same order. Than we can use the equals method:

        System.out.println(l1.equals(l2));              //=>true

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);
                                                      //n1 & n2 have the same elements but their order is different.
                                                      //So the equals() will return false to n1.equals(n2)
        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));

//----------isEmpty() - return type:boolean--returns true or false
//----------checking if the list is empty (does or does not have any elements) -----------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println(n1.isEmpty());           //=>false
        System.out.println(n2.isEmpty());           //=>false

//----------clear() - return type:boolean--returns true or false
//----------remove everything from the ArrayList, ArrayList will not have elements anymore ----------------
        System.out.println("----------------------------------------------------------------------------------------");
        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());          //after the clear() they both will have 0 elements so n1.isEmpty()
        System.out.println(n2.isEmpty());          //will return true. =>true


    }
}
