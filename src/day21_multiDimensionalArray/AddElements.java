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

        System.out.println("----Test addElement() for int------------------------------------------");

        int[] numbers = { 100, 90, 80, 70, 60};

        System.out.println(Arrays.toString(numbers));
                                                                              //we can assign the new array to our old
        numbers = ArraysUtility.addElement(numbers, 50);              //array'svariable we can assign it back

        System.out.println(Arrays.toString(numbers));

        System.out.println("----Test addElement() for double---------------------------------------");
        double[] nums = {1.5, 2.5, 3.5, 4.5};

        nums = ArraysUtility.addElement(nums, 5.5);                  //Everytime you call this addElement() it
                                                                             //will continue to create new Array object
        nums = ArraysUtility.addElement(nums, 6.5);

        nums = ArraysUtility.addElement(nums, 7.5);

        System.out.println(Arrays.toString(nums));

        System.out.println("----Test addElement() for String---------------------------------------");

        String[] students = {"Yasin", "Sumeye", "Ermek"};

        students = ArraysUtility.addElement(students, "Umran");

        students = ArraysUtility.addElement(students, "Abidullah");

        students = ArraysUtility.addElement(students, "Muhtar");

        System.out.println(Arrays.toString(students));

    }


}