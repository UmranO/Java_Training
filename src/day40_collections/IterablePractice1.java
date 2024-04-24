package day40_collections;
import java.util.*;

public class IterablePractice1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10));

        Iterator<Integer> iterator = list.iterator();

        System.out.println( iterator.hasNext() );                  //true
        System.out.println(iterator.next());                       //10

        System.out.println("-----------------------------------");




    }
    }

