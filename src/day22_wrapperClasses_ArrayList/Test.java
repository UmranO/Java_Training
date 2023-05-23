package day22_wrapperClasses_ArrayList;
import utilities.ArraysUtility;
import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 90};

        boolean has25 = ArraysUtility.contains(numbers, 25);

        System.out.println("has25 = " + has25);

        System.out.println("--------------------------------------------");

        String[] students = {"Sumeye", "Hamza", "Marika", "Marika"};

        System.out.println(ArraysUtility.contains(students,"Khashayar"));

        //Asagisi benim yapip dogrulugundan emin olmadigim method'larin testi. Calisiyor gibi. Sonra duplicate'i M'nin
        //istedigi gibi tekrar yapmaya calis.

        System.out.println((Arrays.toString(ArraysUtility.removeElementByIndex(numbers, 2))));

        System.out.println("--------------------------------------------");

        int[] numbers1 = {10,90,10,10,30,30,40,40,10,50,70,70,70,70,90};

        System.out.println(Arrays.toString(ArraysUtility.removeDup(numbers1)));


    }
}
