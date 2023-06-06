package day24_arrayList_dateAndTime;
import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args){

//----Static Methods of LocalTime Class-These are used to create the LocalTime objects & Called from Class Name---------

        LocalTime starting_time=LocalTime.of(10,30);
        System.out.println(starting_time);

        LocalTime right_now=LocalTime.now();
        System.out.println(right_now);

System.out.println("------------------------------------------------");

//----Instance Methods of LocalTime Class-These are called from the LocalTime objects-----------------------------------
//----plusHours() adds the #of hours mentioned in () to the object that it is called from-------------------------------

        LocalTime time1=LocalTime.of(23,59,59);
        time1.plusHours(1);
        time1=time1.plusHours(1);
        System.out.println(time1);                                                         //00:59:59

//----plusHours() adds the #of minutes mentioned in () to the object that it is called from-----------------------------

       time1= time1.plusMinutes(45);
        System.out.println(time1);                                                         //01:44:59

//----isEqual(), isBefore() & isAfter() are used to compare 2 LocalTime objects-----------------------------------------
//----the way we use them are exact same way that we use for LocalDate objects------------------------------------------

    }
}
