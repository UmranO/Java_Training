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

    queue1.poll();                                   //==>FIFO
    System.out.println(queue1);
    queue1.poll();
    queue1.poll();
    queue1.poll();
        System.out.println(queue1);

    //  System.out.println(queue1.get(4));           Can't use get(), bec. we don't have get() & index #s in Queue

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
        System.out.println(queue2);                      //Results in empty Queue []

    //  System.out.println(queue2.get(3));               Can't use get(), bec. we don't have get() & index #s in Queue

System.out.println("--LinkedList as a Queue--------------------------------------------------------------------------");
    Queue <Integer> queue3 = new LinkedList<>();          // insertion order,has index

    queue3.addAll(Arrays.asList(10,200,300,40,90));
    queue3.addAll(Arrays.asList(10,200,300,40,90));
    queue3.addAll(Arrays.asList(null, null, null));       //accepts null
        System.out.println(queue3);

    queue3.poll();
        System.out.println(queue3);
        System.out.println(((LinkedList)queue3).get(4));  //To be Able to call get() of List first we should downcast it
                                                          //to LinkedList(since now it's a Queue referenced LinkedList)
                                                          //after downcasting is completed then we can call the get()
System.out.println("-----------------------------------------------------------------------------------------");

        List<Integer> list = new LinkedList<>();            //LinkedList is both a Queue and a List.
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list.get(1));                    //It's possible to call the get() which is present in the
                                                            //List reference type
        System.out.println(list);

        // list.poll();                                       It's NOT possible to call the get() which is NOT present
                                                            //in the List reference type
        ((LinkedList)list).poll();                          //So if we want to use it we need to cast it (UO: though
                                                            //this is not the best practice )
        System.out.println(list);                           //At this point after poll()1st element is removed from list

        ((Stack) list).pop();                               //LIFO  ==>results in ClassCastException

        System.out.println(list);
    }

}
