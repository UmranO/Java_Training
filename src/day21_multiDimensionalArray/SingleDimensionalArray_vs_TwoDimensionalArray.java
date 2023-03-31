package day21_multiDimensionalArray;
import java.util.Arrays;
public class SingleDimensionalArray_vs_TwoDimensionalArray {
    public static void main(String[] args) {
        int[] arr1D=new int[10];
        arr1D[0]=100;
        System.out.println(Arrays.toString(arr1D));

        int[][] arr2D=new int[5][];           //index: 0~4;
        arr2D[0]=arr1D;

        System.out.println(Arrays.deepToString(arr2D));

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};
        int[] arr3 = {9, 10};
        int[] arr4 = {11, 12, 13, 14, 15};
        int[] arr5 = {16, 17, 18, 19, 20, 21};

        int[] arr6 = {30, 40, 50, 60, 70, 80, 90};

        int[][] arr2D1=new int[5][];                      //Can contain 5 single dimensional array
        arr2D1[0]=arr1;
        arr2D1[1]=arr2;
        arr2D1[2]=arr3;
        arr2D1[3]=arr4;
        arr2D1[4]=arr5;
    //  arr2D1[5]=arr6;                                 //since the size of arr2D1 is 5 we can't add the 6th element

        System.out.println(Arrays.deepToString(arr2D1));   //If more than 1D Array must use deepToString

    }
}
