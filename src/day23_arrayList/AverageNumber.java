package day23_arrayList;
import java.util.ArrayList;

public class AverageNumber {

    public static void main(String[] args){


        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);

        int sum = 0;

        for(Integer each : list ){
            sum += each;
        }
        double average = sum / (double)list.size();   //size() will give us the total # of elements in this list.The return
        //type of this size() is int & the return type of this sum is also int
        //so when int is divided by int we'll get an int & then that int will
        //be converted to the decimal. If we want to get an exact decimal
        //result when we divide sum by list.size()? -We have to cast 1 of them
        //to decimal. As long as 1 is decimal result will be exact decimal.

        System.out.println("average = " + average);
    }
}
/*
2. Write a program that can find the average number from an arrayList of integers
 */