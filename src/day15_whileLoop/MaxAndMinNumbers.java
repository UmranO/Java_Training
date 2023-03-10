package day15_whileLoop;
import java.util.Scanner;
public class MaxAndMinNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int max = -2147483648;                                     //Give a temporary value
        int min =  2147483647;

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number");
            int num=input.nextInt();

            if (num>max) max=num;                                 //This if sT. will be repeated for every single entry
            if (num<min) min =num;

        }
        System.out.println("min # = "+ min +" " + "AND max # = " + max);                                         //UO

//        System.out.println("Maximum number is: " + max);
//        System.out.println("Minimum number is: " + min);

        input.close();
    }


}
//We can find both the min and the max in the same loop. We'll use 2 ints bec max and min are 2 diff. data. We shoud
//have enough containers / variables for each data!
//By putting if Statement in the loop we're able to compare each entry with each other