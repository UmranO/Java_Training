package day40_collections;
import java.util.*;

public class QueueDemo {

    public static void main (String[] args){

System.out.println("--PriorityQueue----------------------------------------------------------------------------------");
    Queue <Integer> queue1 = new PriorityQueue<>();  //Order is random (when we print it, otherwise it is prioritized

    queue1.addAll(Arrays.asList(10,200,300,40,90));  //either in their natural order or with a custumized comparator) &
    queue1.addAll(Arrays.asList(10,200,300,40,90));  //Allows duplicates
    queue1.addAll(Arrays.asList(10,200,300,40,90));
  //queue1.addAll(Arrays.asList(null,null,null));    //doesn't accept null.-->Results in NullPointer Exception
       System.out.println(queue1);

    queue1.poll();
    System.out.println(queue1);
    queue1.poll();
    queue1.poll();
    queue1.poll();
        System.out.println(queue1);

System.out.println("--ArrayDeque-------------------------------------------------------------------------------------");
    Queue <Integer> queue2 = new ArrayDeque<>();     //insertion order is preserved

    queue2.addAll(Arrays.asList(10,200,300,40,90));  //Allows duplicates
    queue2.addAll(Arrays.asList(10,200,300,40,90));

  //queue2.addAll(Arrays.asList(null,null,null));    //doesn't accept null.-->Results in NullPointer Exception
        System.out.println(queue2);

        queue2.poll();
        System.out.println(queue2);                 //at this point we have 9 elements in the ArrayDeque & if we call
                                                    //the poll() 9 times then the ArrayDeque will be empty
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        System.out.println(queue2);                 //Results in empty Queue []

System.out.println("--LinkedList as a Queue--------------------------------------------------------------------------");
    Queue <Integer> queue3 = new LinkedList<>();

        System.out.println("-----------------------------------------------------------------------------------------");

        List<Integer> list = new LinkedList<>();            //LinkedList is both a Queue and a List.



    }

}
