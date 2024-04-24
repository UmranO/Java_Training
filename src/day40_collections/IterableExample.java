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

System.out.println("--In the loop we should use either Iterator's remove()-------------------------------------------");

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

System.out.println("--It's also possible to use for loop instead of while loop to use Iterator's remove()------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext();  ) {  //in the for loop we need
                                                                        //(initialization; condition; update) {
                                                                        //     code to be executed}
                                                                        //Iterator<Integer> i= list3.iterator();
                                                                //initializes an iterator for the list3 collection
                                                                //instead of a counter variable used for iteration.
                                                                //i.hasNext(); is used to checks if there are more
                                                                //elements in the collection to iterate over instead of
                //a regular condition (eg i < 10). It is evaluated before each iteration. If the condition evaluates to
                //true, the loop continues; if it evaluates to false, the loop terminates.
                //Since Iterator<Integer> i= list3.iterator(); trasverse through the elements & i.hasNext() checks the
                //availibility next element and stops when there isn't any we don't need to ++ or -- a counter
            Integer each = i.next();                            //we get the next element and assigbn it to each

            if(each < 5){
                i.remove();                                     //if in line with the filtering condition we remove each
            }

        }

        System.out.println(list3);

System.out.println("--In the loop we should use either Iterator's remove() OR removeIf() -Asagida-------------------");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list4.removeIf( each -> each < 5);                   //Much easier & shorter way of removing an element while
                                                             //iterating compared to iterator()s

        System.out.println(list4);


    }
}
