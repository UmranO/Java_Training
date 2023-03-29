package day20_forEach;
import java.util.Arrays;
public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);

        System.out.println(result);

        System.out.println("---------------------------------------");

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};

        boolean r1 = Arrays.equals(a1, a2);

        System.out.println(r1);

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1, ch2);

        System.out.println(r2);






    }
}
