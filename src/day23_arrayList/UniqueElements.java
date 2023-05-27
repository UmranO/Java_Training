package day23_arrayList;
import java.util.ArrayList;

public class UniqueElements {      //Benim 1stUnique ile Unique Class'im karismis. So onceki commitler'deki Class name
                                   //aslinda FirstUnique olmaliydi. Commit message dogru

    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");

        for (String each : names) {                                 //To display the unique names from an ArrayList<>
            if(names.indexOf(each) == names.lastIndexOf(each)){     //we need to access to each elem. of the ArrayList
                System.out.println(each);                           //If the position of this name 1st seen==position
                                                                    //that name last seen it means that name is unique
                // break;                             if the reqirement is to display the 1st unique we can use break;
            }
    }
    }
}
//Display the unique names from an ArrayList<>