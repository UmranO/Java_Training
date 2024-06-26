package day40_collections;
import java.util.*;
public class CollectionPractice {

    public static void main (String [] args){

        List <Integer> list1 = new ArrayList<>();
        List <Integer> list2 = new LinkedList<>();
        List <Integer> list3 = new Vector<>();
        List <Integer> list4 = new Stack<>();

System.out.println("Collection can reference to the List Classes-----------------------------------------------------");

        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700));

        System.out.println(collection);

        System.out.println( ((ArrayList) collection).get(2) ); //If we use the supertype as the reference type which
                                                               //doesn't have the() we want to use & which is in the
                                                               //object type we need to downcast it to be able to use it
                                                               //Only after this part ((ArayList)collection)
                                                               //after downcasted we can call the object type's ()
                                                             //Here we don't need ArrayList<Integer> ArrayList is enough


        //System.out.println(((Stack)collection).pop());   //Can't do it like this bec.it results in ClassCastException
                                                           //This way we are trying to Stack to be a reference to an
                                                           //ArrayList object (collection = new ArrayList<>();)
                                                           //To be able to make reference type castings there should be
                                                           //is A Relationship between the types.

System.out.println("Collection can reference to the Set Classes--------------------------------------------------------");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));

        System.out.println(collection2);

        //System.out.println(( (ArrayList)collection2 ).get(4));  Can't cast to another type that doesn't have is A Rel.

        System.out.println (  new ArrayList<>(collection2).get(4)  ); //If the ArrayList object is going to be used once
                                                                      //no need to assign it to a variable
        List<Integer> l = new ArrayList<>(collection2);               //But if it will be used more than once it's
                                                                      //better to assign it.

    }
}