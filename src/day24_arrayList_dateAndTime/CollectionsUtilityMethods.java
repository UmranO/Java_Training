package day24_arrayList_dateAndTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class CollectionsUtilityMethods {
    public static void main(String[] argds){

System.out.println("----replaceAll()--------------------------------------------------------------------------------");
//If we have to change all the elements:"Java" with "Python"

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println(names);

//If we didn't have replaceAll() we should do it with a loop:
        for (int i=0; i<names.size(); i++) {
            if(names.get(i).equals("Java")){names.set(i,"Python");}
        }
        System.out.println(names);

//With the replaceAll()
//arguements :1)Collection that we'll apply this () to, 2)old value, 3)new value

        Collections.replaceAll(names,"Java","Pyhthon");     //we could have used a loop but this is easier
        System.out.println(names);

System.out.println("----frequency()--------------------------------------------------------------------------------");
//Returns the frequency of the specified element in the specified Collection

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

//to find the frequency of 50:
//arguements :1)Collection that we'll apply this () to, 2)element that you want to find the frequency of

       int count=Collections.frequency(list,50);
        System.out.println(count);

System.out.println("-----------------------------------");

        //Find the total # of "Java"
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int frequency1=Collections.frequency(words,"Java");
        System.out.println(frequency1);

    }
}
