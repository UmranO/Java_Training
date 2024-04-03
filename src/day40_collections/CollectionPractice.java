package day40_collections;
import java.util.*;
public class CollectionPractice {

    public static void main (String [] args){

        List <Integer> list1 = new ArrayList<>();
        List <Integer> list2 = new LinkedList<>();
        List <Integer> list3 = new Vector<>();
        List <Integer> list4 = new Stack<>();

        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700));

        System.out.println(collection);

        System.out.println( ((ArrayList) collection).get(2) ); //If we use the supertype as the reference type which
                                                               //doesn't have the() we want to use & which is in the
                                                               //object type we need to downcast it to be able to use it
                                                               //Only after this part ((ArayList)collection)
                                                               //after downcasted we can call the object type's ()

        
    }
}