package day41_maps;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionPractice {
    public static void main(String[] args){

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        List<List<Integer>> lists = new ArrayList<>();       //Term multidimentional is NOT used in Collection like
                                                             //Array. We can have multidimentional Arrays but can't
                                                             //have multidimentional Collection types. BUT we can have
                                                             //List of Lists, List of Sets...


    }
}
