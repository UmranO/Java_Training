package day39_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args){
        System.out.println("HashSet----------------------------------------------------------------------------------");

        Set<Integer> set1 = new HashSet<>();                          //order is random, accepts null key
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));             //if we continue to add same elements it won't
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));             //accept it
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null, null));    //even though accepts null key can only have 1 null

        System.out.println(set1);

        System.out.println("List-------------------------------------------------------------------------------------");

        //But if it were a List it would accept the duplicate elements & also would maintain the insertion order &
        //would also accept more than 1 null elements
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));           //accepts duplicates,has index,keeps insertion order
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(list);

        System.out.println("LinkedHashSet----------------------------------------------------------------------------");
        Set<Integer> set2 = new LinkedHashSet<>();                 //Keeps insertion order, accepts null key
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set2);

        System.out.println("TreeSet----------------------------------------------------------------------------------");

        String str = null;
       //System.out.println(str.toLowerCase());

        Set<Integer> set3 = new TreeSet<>();                     //Keeps sorted order, does not accept duplicate
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
       //set3.addAll(Arrays.asList(null, null, null, null, null));  --> NullPointerException

        System.out.println(set3);

        System.out.println("Removing the duplicates by converting Array to Set---------------------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        Set<String> result = new LinkedHashSet<>();
        result.addAll( Arrays.asList(words) );       //Added the elements of Array(words) as List since it only accepts
        System.out.println(result);                  //Collection type. This way we got rid of the duplicate elements.


   /*  System.out.println(result.get(1));              In the set we don't have index # and get()


        for (String each : result) {                  Like all the Data Structures we can use for each loop for Sets too
            System.out.println(each);                 but we can't retrieve it with get()
        }
*/
        System.out.println( new ArrayList<>(result).get(1) );  //If we want to get a specific element we can create an
                                                               //ArrayList or any other List give the elements of the
                                                               //set in the ArrayList's constructor and get the element
                                                               //in the required index #

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("If we want to get rid of the duplicates in an Array or Data Structure first we can convert" +
                           "it to Set then change back to Array again");

        words = result.toArray(new String[0]);                 //converting Set to Array & assign it back to the Array's
                                                               //variable
        System.out.println("Words Array : " + Arrays.toString(words));   //toArray() is a () of Collection so can be
                                                                         //used for converting Set to Array too.
        System.out.println("-----------------------------------------------------------------------------------------");
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50,5, 5, 5, 1, 1, 1, 2, 2,2));

        Set<Integer> n=new TreeSet<>(numbers);                //List to Set--This way we got rid of the duplicates +
        System.out.println(n);                                //Sorted the elements in Ascending order.



    }
}
