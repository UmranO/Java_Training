package day19_array;
import java.util.Arrays;
public class ArrayObjects {
    public static void main(String[] args){

        int[] arr1 = {10, 20, 30, 40, 50};                  //1 Object will be created in the heap but 3 variables are
        int[] arr2 = arr1;                                  //referencing to the same Array object
        int[] arr3 = arr2;

        arr1[0] = 1000;                                    //Since they reference to the same object all 3 Arrays'
        arr2[2] = 3000;                                    //values in indexes 0 & 2 will be changed

        System.out.println(Arrays.toString(arr1) );        //Since they reference to the same object result of this
        System.out.println(Arrays.toString(arr2) );        //3 print statements will be same
        System.out.println(Arrays.toString(arr3) );

        System.out.println("----------------------------------------------------");
                                                          //BUT 1 variable cn't reference more than 1 object at the same
        String[] a1 = {"Umran", "Mehmet"};                //time

        a1 = new String[]{"James", "Daniel"};             //to specify that this is an Array object


        System.out.println(Arrays.toString(a1));


    }
}
