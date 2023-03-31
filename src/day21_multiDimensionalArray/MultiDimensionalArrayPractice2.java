package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {

        int[][] arr2D1 = { {1,2} , {3, 4, 5} };
        int[][] arr2D2 = { {6, 7,8, 9}, {10, 11}, {12, 13, 14} };
        int[][] arr2D3 = { {15, 16, 17, 18}};                 //If we want to store them into 1 container what should be
                                                              //our container for 2D arrays? Only the 3DArray can be a
                                                              //container for 2D Arrays

                                                              //3DArray mean 3[]s
        //                   0       1               0          1          2                   0
        int[][][] arr3D={ {{1,2},{3, 4, 5}},   {{6, 7, 8, 9},{10, 11},{12, 13, 14}},   {{15, 16, 17, 18}} }; //index:0~2
        //      index:              0                           1                               2

        //[index of 2d array] [index of 1d array] [index of elements]

        //to print the 3D Array
        System.out.println(Arrays.deepToString(arr3D));

        //to print the 2D Array at index1 of arr3D
        System.out.println( Arrays.deepToString( arr3D[1] ) ); // [[6, 7, 8, 9], [10, 11], [12, 13, 14]]

        //to print the 1D Array at index0 of arr3D & index1 of the 2D Array
        System.out.println( Arrays.toString( arr3D[0][1] ) ); // [3, 4, 5]

        //to print the 1D Array at index1 of arr3D & index0 of the 2D Array
        System.out.println( Arrays.toString( arr3D[1][0]  )); // [6, 7, 8, 9]

        System.out.println(arr3D[1][2][2]);                   // 14

        System.out.println(arr3D[2][0][3]);                   // 18

        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < arr3D.length; i++) { //i: index of number of each 2 dimensional array
            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) { // j: index number of each 1 dimensional array
                int[] each1DArray = each2DArray[j];
                System.out.println( Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) { // k: index number of each element
                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);
                }


            }

        }


    }
}
