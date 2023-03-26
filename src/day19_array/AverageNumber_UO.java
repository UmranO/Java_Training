package day19_array;
import java.util.Scanner;
public class AverageNumber_UO {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);                               //This new Scanner object will also be
        System.out.println("How many numbers do you want to enter?");       //allocated in the Heap
        int num=input.nextInt();                                            //This # will be the size of our Array
        if (num==0){
            System.out.println("Thank you");
            return;    }                                                    //return'u print statement'dan once koyma!

        int[] arr=new int[num];
        int sum=0;

        for(int i=0; i<num; i++) {                                         //i will also be the index # of the Array
            System.out.println("Enter number you want");
             int numU =
            arr[i]=input.nextInt();
            sum+=numU;
        }                                       //usually the average # will be a decimal so declare double average
        double average=sum/(double)num;         //int/int will give us an int so if we want to get a decimal we need to
        System.out.println(average);            //change either numerator or denominator to decimal so we can cast one
        input.close();                          //of them to decimal. If we don't cast we'll get smtg like 10.0 or num.0
    }
}
/*	5. AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number */
