package day20_forEach;
import java.util.Arrays;
public class ForEachLoopPractice {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : numbers) {

            if (each % 2 != 0) {
                System.out.println(each);
            }

        }

        System.out.println("-------------------------------------------");

        int[] nums = {100, 20, 30, 40, 5, 4, 3, 1, 2, 1000, 300, 500};

        int max = nums[0];                            //We are assuming that the 1st element in this Array is the max
        int min = nums[0];                            //We are assuming that the 1st element in this Array is the min

        for (int each : nums) {                       //We are checking it with the remaining elements

            if(each > max){                           //If each is bigger than the max then we have to change the max
                max = each;                           //max should be each
            }

            if(each < min){
                min = each;
            }

        }

        System.out.println("max = " + max);

        System.out.println("min = " + min);

        System.out.println("-------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {60, 70, 80, 90, 100, 110, 120};

        int[] a3 = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++]= each;
        }

        for (int each : a2) {
            a3[k++]=each;
        }

        System.out.println(Arrays.toString(a3));

        System.out.println("-------------------------------------------");
    }
}