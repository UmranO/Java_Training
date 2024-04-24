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

System.out.println("--In the loop we should use Iterator's remove()--------------------------------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        Iterator<Integer> it = list2.iterator();        //1st we should create the Iterator object

        while (it.hasNext()) {                          //2nd we should create the while loop to check if it has the
            Integer each = it.next();                   //next element. If yes we get the next element.
            if (each < 5) {                             //we filter with our condition
                it.remove();                            //if the condition applies then we should remove that element
            }                                           //since these 3 methods are correlated we don't need to give
        }                                               //each in the () of remove method. We can call these () from
                                                        //Iterator object not from the Collection object
        System.out.println(list2);

    }
}
