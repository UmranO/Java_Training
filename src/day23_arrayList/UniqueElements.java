package day23_arrayList;
import java.util.ArrayList;
public class UniqueElements {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        System.out.println(list);

        for (Integer element : list) {         // 1

            int frequency = 0;
            for (Integer each : list) {
                if(each == element){
                    frequency++;
                }
            }
            if(frequency == 1){
                System.out.println(element);
                break;                            // exiting the loop, in order to return the first unique element only
            }
        }
    }
}
/*
3. Write a program that can return the first unique elements from an arraylist
Ex:
        ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}   For the ArrayList we can Not use the Literal to give all the elements
        at once,but we can use addAll() to add all the elements at once! Any operation that we want to do with ArrayList
        we have to use the methods.
        output:2
 */
