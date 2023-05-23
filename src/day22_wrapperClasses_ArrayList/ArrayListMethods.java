package day22_wrapperClasses_ArrayList;
import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        System.out.println(list);                  //Now list is empty=size is 0

//----------add() - directly adding to the end------------------------------------------------------------------------

        list.add(10);                              //We have to add object, not a primitive. This 10 by default int-
                                                   //primitive- but it is autoboxed into Integer which is an object
                                                   //The add() internally converts this primitive into Integer Wr. Class
                                                   //Which means if you need integer elements into this ArrayList
                                                   //you can just pass the primitive int.
                                                   //Everytime you call this add() & add an element the size of the
                                                   //ArrayList will be increased by 1.
        System.out.println(list);

        list.add(10);  //0
        list.add(20);  //1
        list.add(30);  //2
        list.add(10);  //3                         //Like Array ArrayList also accepts Duplicates

        System.out.println(list);

        //list.add(5.5);                           //If the Data Type is Integer we can't add Double!Argument should be right.

        System.out.println(list);

//----------add() - inserting ------------------------------------------------------------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");
        list.add(1,15);              //2nd way of using add() to insert an element to a specific index

        System.out.println(list);

        list.add(2,25);

        System.out.println(list);

//----------get() - retrieving ------------------------------------------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList);
        String firstStudent=studentsList.get(0);
        System.out.println(firstStudent);
        String lastStudent = studentsList.get( studentsList.size() -1  ); //last student from the studentsList
        System.out.println(lastStudent);

//----------size() - directly adding to the end------------------------------------------------------------------------
System.out.println("-------------------------------------------------------------------------------------------------");

System.out.println(studentsList.size());



    }
}
