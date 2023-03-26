package day19_array;
import java.text.DecimalFormat;
import java.util.Scanner;
public class AverageNumber_UO {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);                               //This new Scanner object will also be
        System.out.println("How many numbers do you want to enter?");       //allocated in the Heap
        int num=input.nextInt();                                            //This # will be the size of our Array
        if (num==0){                                                        //average hesaplarken buu sayiya bolecegiz
            System.out.println("Thank you");                                //so it shouldn't be zero
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
                                                //of them to decimal. If we don't cast we'll get smtg like 10.0 or num.0
        DecimalFormat df =new DecimalFormat("0.00"); //We can use decimal formater to limit the numbers after .
                                                            //1st we need to have the object of the DecimalFormat Class
                                                            //Usually df is given as the variable name
                                                           //We can give the pattern in the new object of the DecimalFo.
        System.out.println("average: " + df.format(average) ); //than from this object we can call the format() & in ()
                                                               //we can pass the number we want to format
        input.close();                                         //This won't change the # but only show the # as we want
    }
}
/*	5. AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number */
