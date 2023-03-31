package day21_multiDimensionalArray;
import java.util.Arrays;
public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {


        // index of elements:    0   1   2      0  1   2   3   4     0    1
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}};
        //index of 1D Array:      0                 1                     2

        System.out.println("UO_To get every single Element from 2D Array: with For Each Loop");


        for (int[] each1DArray : arr2D) {                             //Getting each 1D Arrays If we can get each
            for (int eachElement : each1DArray) {                     //1DArrays then we can also get each element
                System.out.print(eachElement+"\t");}}
                System.out.println();

        System.out.println("---------------------------------------------------------------");
                System.out.println("UO_To get every single Element from 2D Array: with For Loop");


        for (int i = 0; i < arr2D.length; i++) {
             for (int j = 0; j < arr2D[i].length; j++) {
                        System.out.print(arr2D[i][j] + "\t");
                    }
                }
                System.out.println();

        System.out.println("---------------------------------------------------------------");
                System.out.println("M_To get every single Element from 2D Array: with For Loop");


         for (int i = 0; i < arr2D.length; i++) {                 //i: index # of 1D array in arr2D
                    int[] each1D = arr2D[i];
                    System.out.println(Arrays.toString(each1D));

              for (int j = 0; j < each1D.length; j++) {            //j: index # of elements in each 1D array of arr2D
                        int eachElementM = each1D[j];
                        System.out.println(eachElementM);
                    }
                }
                System.out.println("---------------------------------------------------------------");

                System.out.println("M_To get every single Element from 2D Array: with For Each Loop");

        for(int[]  each1DArray : arr2D ){
            System.out.println(Arrays.toString(each1DArray));

            for(int eachElement  : each1DArray ){
                System.out.println(eachElement);
            }

        }
        System.out.println("---------------------------------------------------------------");

        System.out.println("M_To get every single Element from 2D Array: with For Loop ShortCut");
        for (int i = arr2D.length - 1; i >= 0; i--) {          //From the arr2D.forr+Enter Then from arrD2[i].forr+Enter
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.println(arr2D[i][j]);
            }
        }
        System.out.println("---------------------------------------------------------------");

        System.out.println("M_To get every single Element from 2D Array: with For Each Loop ShortCut");

        for (int[] each1DArray : arr2D) {                  //From the arr2D.for+Enter Then from each1DArray.for+Enter
            for (int eachElement : each1DArray) {          //From each 1DArray's elements can be iterated by for Each
                System.out.println(eachElement);
            }
            
        }
        
    }
}