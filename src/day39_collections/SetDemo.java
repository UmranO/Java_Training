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
        Set<Integer> set2 = new LinkedHashSet<>();  // keeps insertion order, accepts null key
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set2);
    }
}
