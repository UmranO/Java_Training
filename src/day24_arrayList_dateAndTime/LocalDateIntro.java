package day24_arrayList_dateAndTime;
import java.time.LocalDate;                                     //to able to use LocalDate ()s we have to import

public class LocalDateIntro {

    public static void main(String[] args){
//----Static Methods of LocalDate Class---------------------------------------------------------------------------------
//1)----now()------if we need  need to print today's date:--------------------------------------------------------------
//eg if in our Java App if we want to get today's date:Every time when we run this program depending on the date that I
//run it should display today's date

        LocalDate today=LocalDate.now();                                  //2023-06-02
        System.out.println(today);

//2)----of()------if we need  need to print a specic date:--------------------------------------------------------------
        LocalDate birthDay = LocalDate.of(1970, 2, 13);
        System.out.println(birthDay);

System.out.println("-------------------------------------------------------------------------------------------------");
//----Instance Methods of LocalDate Class-------------------------------------------------------------------------------
//----getYear()----returns the year of that LocalDate object------------------------------------------------------------
        System.out.println(today.getYear());                              //2023

//----getMonth()----returns the month of that LocalDate object----------------------------------------------------------
        System.out.println(today.getMonth());                             //JUNE

//----getMonthValue()----returns the # of that LocalDate object's month-------------------------------------------------
        System.out.println(today.getMonthValue());                        //6

//----getDayOfWeek()----returns the name of the Days of that LocalDate object's Week like Monday, Tuesday...------------
        System.out.println(today.getDayOfWeek());                        //FRIDAY
        System.out.println(birthDay.getDayOfWeek());                     //FRIDAY

//----getDayOfMonth()----returns the # of that LocalDate object's month like 1,2..28,29,30,31(depending on the month)---
        System.out.println(today.getDayOfMonth());                      //2
        System.out.println(birthDay.getDayOfMonth());                   //13

//----getDayOfYear()----returns the day of that LocalDate object's year like 1,2,31,125,250,365/366(if a leap year)-----
        System.out.println(today.getDayOfYear());                       //153
        System.out.println(birthDay.getDayOfYear());                    //44


    }
}
