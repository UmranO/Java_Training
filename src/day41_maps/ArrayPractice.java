package day41_maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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



    }
}
