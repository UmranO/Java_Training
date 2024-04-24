package day40_collections;
import java.util.*;

public class IterablePractice1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10));

        Iterator<Integer> iterator = list.iterator();

        System.out.println( iterator.hasNext() );                  //true
        System.out.println(iterator.next());                       //10

System.out.println("-----------------------------------------------------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        //Remove all the names Ahmed (Case Insensitive)

System.out.println("--Removal with iterator------------------------------------------------------------------");

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String each = it.next();
            if(each.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println(names);

System.out.println("--Removal with removeIf()------------------------------------------------------------------");

List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));


        names2.removeIf( p -> p.equalsIgnoreCase("ahmed"));     //Dikkat etmen gereken direkt Collection'dan
                                                                            //call ediyoruz.
        System.out.println(names2);




    }
    }

