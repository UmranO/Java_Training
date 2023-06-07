package day25_dateAndTimeContinued_constructors;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y");

        LocalDate today=LocalDate.now();         //Default pattern is: 2023-06-06
        System.out.println(today);               //If we want another format then we have to use DateTimeFormatter Class

        System.out.println(today.format(df));    //2023


    }
}
