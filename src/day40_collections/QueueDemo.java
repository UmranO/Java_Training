package day40_collections;
import java.util.*;

public class QueueDemo {

    public static void main (String[] args){

System.out.println("--PriorityQueue----------------------------------------------------------------------------------");
    Queue <Integer> queue1 = new PriorityQueue<>();  //Order is random (when we print it, otherwise it is prioritized
    queue1.addAll(Arrays.asList(10,200,300,40,90));  //either in their natural order or with a custumized comparator) &
    queue1.addAll(Arrays.asList(10,200,300,40,90));
    queue1.addAll(Arrays.asList(10,200,300,40,90));
  //queue1.addAll(Arrays.asList(null,null,null));    //doesn't accept null.--.Results in NullPointer Exception

    System.out.println(queue1);
    queue1.poll();
    System.out.println(queue1);
    queue1.poll();
    queue1.poll();
    queue1.poll();
    System.out.println(queue1);

System.out.println("--ArrayDeque-------------------------------------------------------------------------------------");
    Queue <Integer> queue2 = new ArrayDeque<>();     //insertion order is preserved
    queue2.addAll(Arrays.asList(10,200,300,40,90));





    Queue <Integer> queue3 = new LinkedList<>();

        System.out.println("-----------------------------------------------------------------------------------------");

        List<Integer> list = new LinkedList<>();            //LinkedList is both a Queue and a List.



    }

}
