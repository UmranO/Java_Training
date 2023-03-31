package utilities;
import java.util.Arrays;
public class ArraysUtility {

//----Merge()-- 2 int Arrays--------------------------------------------------------------------------------------------

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];   //to make sure that 3rd array has enough capacity to contain
        //all the elements of arr1 and arr2

        int k = 0;                                         // for third array's index number
        for (int i = 0; i < arr1.length; i++, k++) {       //i: for first array's index numbers
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {       //i: for second array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }

//----Merge()--2 double Arrays------------------------------------------------------------------------------------------

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];         //to make sure that 3rd array has enough capacity
        //to contain all the elements of arr1 and arr2
        int k = 0;                                                    //for third array's index number
        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }
//----Merge()--2 char Arrays--------------------------------------------------------------------------------------------

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];          //to make sure that 3rd array has enough capacity to
        //contain all the elements of arr1 and arr2

        int k = 0;                                                 //for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) {                //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {                //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }

//----Merge()--2 String Arrays------------------------------------------------------------------------------------------

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length];      //to make sure that 3rd array has enough capacity to
        //contain all the elements of arr1 and arr2
        int k = 0;                                                 //for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) {                //i: for first array's index numbers
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {                //i: for second array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }
//----Reverse()--int Array----------------------------------------------------------------------------------------------

    public static int[] reverse(int[] array) {

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        return reverse;
    }
//----Reverse()--double Array-------------------------------------------------------------------------------------------

    public static double[] reverse(double[] array) {

        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        return reverse;
    }
//----Reverse()--char Array---------------------------------------------------------------------------------------------

    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        return reverse;
    }
//----Reverse()--String Array-------------------------------------------------------------------------------------------

    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        return reverse;
    }

//----AddElement()--int Array-------------------------------------------------------------------------------------------

    public static int[] addElement(int[] array, int element) {
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }
//------AddElement()--double Array--------------------------------------------------------------------------------------

    public static double[] addElement(double[] array, double element) {
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }
//------AddElement()--char Array----------------------------------------------------------------------------------------

    public static char[] addElement(char[] array, char element) {
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

//------AddElement()--String Array--------------------------------------------------------------------------------------

    public static String[] addElement(String[] array, String element) {
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

//------Contains()--int Array-------------------------------------------------------------------------------------------

    public static boolean contains(double[] array, double element){
        for (double each : array) {
            if(each == element){
                return true;                                          //it will return true if we have it in the Array
            }                                                         //Bu if dogru degilse zaten calismayacak so
        }                                                             //we can return false then
        return false;
    }
//------Contains()--char Array------------------------------------------------------------------------------------------

    public static boolean contains(char[] array, char element){
        for (char each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }



}



