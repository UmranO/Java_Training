package day21_multiDimensionalArray;
import utilities.ArraysUtility;
import java.util.Arrays;
public class AddElements {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int element = 90;

        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;

        System.out.println(Arrays.toString(new_array));

        System.out.println("------------------------------------------");

        int[] numbers = { 100, 90, 80, 70, 60};

        System.out.println(Arrays.toString(numbers));

        numbers = ArraysUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));



    }


}