package day20_forEach;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {                        //in for loop i is the index numbers
            System.out.println(numbers[i]);
        }

        System.out.println("------------------------------------");

        for(int  each : numbers){                                        //in for Each Loop each is the elements NOT
            System.out.println(each);                                    //the index numbers!!
        }
    }

}