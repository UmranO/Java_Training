package day41_maps;
import java.util.*;

public class ArrayPractice {
    public static void main(String[] args){

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(70, 80, 90, 100, 110));

        // List<Integer>[] arrayOfListsSil ={list1,list2,list3};   =>Results in Generic Array Creation so when we create
                                                                   //an Array it is possible if we create the Array as
                                                                   //Raw Type and add the lists later. But this may be
                                                                   //a problem -(type safety)
System.out.println("--Arrays of Lists is possible--------------------------------------------------------------------");

        List<Integer>[] arrayOfLists = new List [3];
        arrayOfLists [0]=list1;
        arrayOfLists [1]=list2;
        arrayOfLists [2]=list3;

        System.out.println(arrayOfLists [0].get(0));            //UO =>1
        System.out.println(Arrays.toString(arrayOfLists));      //Since it's an Array we have to use toString() to print
                                                     //=>[[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]

        arrayOfLists[0].set(4,50);
        System.out.println(Arrays.toString(arrayOfLists));
                                                    //=>[[1, 2, 3, 4, 50, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]

        Set<Integer>[] arrayOfSets = new Set[5];
        arrayOfSets[0] = new LinkedHashSet<>();
        arrayOfSets[1] = new LinkedHashSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();
        arrayOfSets[3] = new LinkedHashSet<>();
        arrayOfSets[4] = new LinkedHashSet<>(Arrays.asList(9,7));
        //arrayOfSets[4] = new LinkedHashSet<>(Arrays.asList(9,7));     Bunu ben ekledim. M'de yok

        System.out.println(Arrays.toString(arrayOfSets));               //=> [[], [], [], [], []]

        arrayOfSets[2].addAll(Arrays.asList(1, 2, 3, 4));               //Each object in the Array is a Set

        System.out.println(Arrays.toString(arrayOfSets));               //=>[[], [], [1, 2, 3, 4], [], []]


//Array and Collection they support any objects.

    }
}
