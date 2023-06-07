package day25_dateAndTimeContinued_constructors;
import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args){

        LocalDateTime starts=LocalDateTime.now();
        System.out.println(starts);                                                     //2023-06-06T19:58:54.101272700

        LocalDateTime ends= LocalDateTime.of(2022,5,25,11,0);
        System.out.println(ends);                                                       //2022-05-25T11:00

        System.out.println(starts.getDayOfWeek());                                      //TUESDAY

        System.out.println(starts.getHour());                                           //20

    }
}
