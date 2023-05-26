package day23_arrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args){

//----------addAll() - either 1)adding multiple elements to the end or inserting multiple elements at an index of ------

//----------1)adding multiple elements to the end of an ArrayList-------------------------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

    //If we want to add all the elements of an ArrayList to another ArrayList then we can use this addAll() & when we
    //call this addAll() it asks us to pass a Collection type. eg since ArrayList is a Collection type/ has relation
    //with Collection. Since it is Collection we can pass ArrayList numbers directly to list1 below.

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(numbers);      //When we call this addAll() it will add all the elements of numbers ArrayList to
                                    //list1 which is another ArrayList. & It is going to add them to the end of list1
                                    //after 3.
       System.out.println(list1);   //=> [1,2,3,10,20,30,40]

//----------2a)inserting multiple elements that are contained in a List at an index of an ArrayList w-------------------
System.out.println("-------------------------------------------------------------------------------------------------");

        list1.addAll(1,numbers);  //If we want to insert multiple elems. at a specific index then we have the give
                                        //that index that we want the inserted elems. to start from & the List that we
                                        //want to insert as param.
        System.out.println(list1);      //=> [1,10,20,30,40,2,3]

//----------2b-1)inserting multiple elements that are NOT contained in a List at the end of an ArrayList ---------------
System.out.println("-------------------------------------------------------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();        //If the elems. aren't contained in another ArrayList we
                                                              //we can use the asList() from Arrays Utility Class to
        scores.addAll( Arrays.asList(75, 85, 95, 70, 80) );   //to convert Array of elements to Collection Type

        System.out.println(scores);                           //=>[75,85,95,70,80]

            System.out.println("---------------------");

//----------2b-2)inserting multiple elements that are NOT contained in a List at an index of an ArrayList --------------

       ArrayList<String> students = new ArrayList<>();
       students.addAll(  Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal" )   );//asList() will give us a Collection
                                                                                    //Type needed by addAll()
       System.out.println(students);                                           //=>[Gadir,Hasan,Abidullah,Bilal]

       students.addAll(2,  Arrays.asList("Shukur", "Sumeye", "Tatiana") );

       System.out.println(students);                             //=>[Gadir,Hasan,Shukur,Sumeye,Tatiana,Abidullah,Bilal]


//----------containsAll() - verifies if all those collection of values are contained in the ArrayList or not------------
System.out.println("-------------------------------------------------------------------------------------------------");

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll( Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali" )  );

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");                                                   //=>true

        boolean hasAlenaGadir = employeesList.containsAll( Arrays.asList("Alena", "Gadir") );                 //=>true

        boolean hasMuhtarAliKuzzat = employeesList.containsAll( Arrays.asList("Muhtar", "Ali", "Kuzzat") );   //=>false
                                                                  //All the elements should be present at the same time
        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);


//----------removeAll() - remove all those collection of values that are mentioned--------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20) );
                                                                           //All the 10s &20s will be removed from list
        list.removeAll( Arrays.asList(10, 20) );                           //=> [30, 40, 50, 60, 70]

        System.out.println(list);

//----------retainAll() - keeps all those collection of values that are mentioned,in the ArrayList & removes the others
System.out.println("-------------------------------------------------------------------------------------------------");

ArrayList<String> developers = new ArrayList<>();
developers.addAll(Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar" , "Alena") );

developers.retainAll(Arrays.asList("Alena", "Khashayar", "Muhtar") );   //=>[Alena,Muhtar,Khashayar,Muhtar,Muhtar,Alena]

System.out.println("-----------------------------------------");

ArrayList<String> groceriesList = new ArrayList<>();

groceriesList.addAll(
Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));

groceriesList.retainAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato"));
        System.out.println(groceriesList);                   //=>[Eggs, Potato, Milk, Tomato]-Alternative way of having
                                                             //this list would be:
 groceriesList.removeAll(Arrays.asList("Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));
        System.out.println(groceriesList);                   //=>Same result as above [Eggs, Potato, Milk, Tomato]

    }
}
