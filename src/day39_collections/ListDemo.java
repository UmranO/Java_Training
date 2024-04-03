package day39_collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;


public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // Array Based Class ===> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>();//Node based class (Doubly linked List) ===> add(), addAll()
                                                            //remove(), removeAll(), removeIf(), retainAll() are faster

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("------------------------------------------------------------");

        Vector <Integer> vector=new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);

        System.out.println(vector);

        vector.get(0);

        System.out.println(vector);

        System.out.println("------------------------------------------------------------");

        Stack <Integer> stack= new Stack<>();     //Since it has is A Relationship with List we can use its methods
        stack.add(100);                           //in the Stack as well
        stack.add(200);
        stack.add(300);

        System.out.println(stack);
                                                  //pop() is one of the unique ()s of Stack class and takes out the
        int lastElement=stack.pop();              //After we called the pop() the Stack's last element will be removed
                                                  //last inserted element out of the Stack so we can assign it to an int
        System.out.println(lastElement);

        System.out.println(stack);                //We'll see that the last element is removed after pop() -->[100,200]

        int secondLastElement = stack.pop();
        System.out.println(secondLastElement);

        System.out.println(stack);               //We'll see that the last element is removed after pop() -->[100]

    }
}
