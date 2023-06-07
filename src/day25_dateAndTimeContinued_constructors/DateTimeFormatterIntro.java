package day25_dateAndTimeContinued_constructors;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

//To format LocalDate:
//We can create a DateTimeFormatter object referenced by df & give the pattern as String as argument of ofPattern()
//then after creating the LocalDate object we can call format() of LocalDate Class &give this df as argument
//We can use the same patterns for many objects

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y");

        LocalDate today=LocalDate.now();         //Default pattern is: 2023-06-06
        System.out.println(today);               //If we want another format then we have to use DateTimeFormatter Class

        System.out.println(today.format(df));    //2023

        System.out.println("---------------------------------");

   //   DateTimeFormatter df1=DateTimeFormatter.ofPattern("MMMM-dd-yy");        //July-01-22
   //   LocalDate date1=LocalDate.of(2022,7,1);
   //   System.out.println(date1.format(df1));

        System.out.println("---------------------------------");

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("MMM/dd/y EEEE");    //Jun/23/1988 Friday

        LocalDate gradDate=LocalDate.of(1988,6,23);
        System.out.println(gradDate.format(df1));

System.out.println("------------------------------------------------------------------------------------------------");

//To format LocalTime:
   //   DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");             //07:05

   //   LocalTime time1 = LocalTime.of(7,5);
   //   System.out.println(time1.format(tf));

        DateTimeFormatter tf1 = DateTimeFormatter.ofPattern("H:m");             // 3:1
        LocalTime time2 = LocalTime.of(3,1);
        System.out.println(time2.format(tf1));

        System.out.println("---------------------------------");

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:mm");             // 5:30

        LocalTime time1 = LocalTime.of(17,30);                      //Here we give hours in 24 hour format
        System.out.println(time1.format(tf));

        //if we want to show AM or PM then we should also add a in the pattern:
        DateTimeFormatter tf1a = DateTimeFormatter.ofPattern("hh:mm a");        // 05:30 PM
        LocalTime time3 = LocalTime.of(17,30);
        System.out.println(time3.format(tf1a));

System.out.println("------------------------------------------------------------------------------------------------");

//To format LocalDateTime:
      //  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/y  hh:mm a");         //06/07/2023  01:22 PM
      //  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MM/dd/y  hh:mm a");   //Wednesday, 06/07/2023  01:25 PM
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");  //Wednesday, Jun/07/2023  01:25 PM
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf));

        System.out.println("---------------------------------");
        DateTimeFormatter dtfT = DateTimeFormatter.ofPattern("EEEE,  h:mm a, MMM/dd/y");   //Tuesday,  1:00 PM, Nov/24/2020
                                                                                           //it gets the day name itself
        LocalDateTime ends = LocalDateTime.of(2020,11,24,13,0);
        System.out.println(ends.format(dtfT));

        LocalDateTime bugun = LocalDateTime.now();
        System.out.println(bugun.format(dtfT));

    }
}
