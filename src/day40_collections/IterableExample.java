package day40_collections;
import java.util.*;
public class IterableExample {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

    /*
System.out.println("-- Collection's remove() by object---------------------------------------------------------------");

        for (Integer each : list) {
            if(each < 5){
                list.remove(each);                 If we use Collection's remove() in the loop while we are iterating
            }                                      we'll get ConcurrentModificationException
        }                                          This is Collection's remove() by object What about remove by index#?
      */
System.out.println("--Collection's remove() by index #---------------------------------------------------------------");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5) {
                list.remove(i);                  //Not ConcurrentModificationException but didn't remove elements<5 
            }
        }

        System.out.println(list);



    }}
