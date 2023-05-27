package day23_arrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {

//Converting anArray to ArrayList

        String[] arr = {"A", "B", "C", "D"};

//        ArrayList<String> list=new ArrayList<>();
//        list.addAll(Arrays.asList(arr));                                                 //with addAll()
//        System.out.println(list);

        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));                        //with ArrayList Constructor
        System.out.println(list);

        System.out.println("------------------------------------------------------");

//Converting anArray to ArrayList

        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("Java", "Python", "C#") );

        String[] languages = list2.toArray(new String[0]);                     //From ArrayList we call toArray () &
                                                                               //give the Array object as the argument

        System.out.println(Arrays.toString(languages));

        System.out.println("------------------------------------------------------");

    }
}
