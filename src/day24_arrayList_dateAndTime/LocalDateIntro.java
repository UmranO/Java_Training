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

//----getDayOfMonth()-returns(int) the day of that LocalDate object's month like 1,2..28,29,30,31(depending on the month)
        System.out.println(today.getDayOfMonth());                      //2 -means 2nd day of this month
        System.out.println(birthDay.getDayOfMonth());                   //13

//----getDayOfYear()-returns (int) the day of that LocalDate object's year like 1,2,31,125,250,365/366(if a leap year)
        System.out.println(today.getDayOfYear());                       //153-means that today is 153rd day of this year
        System.out.println(birthDay.getDayOfYear());                    //44

System.out.println("-------------------------------------------------------------------------------------------------");
//when we use the below plus & minus methods they don't change present objects bec LocalDate objects are immutable
//when we use the below plus & minus methods we have the give the number of years,days,weeks..in the ()

//----plusYears()----returns the date after years in () added to the present LocalDate object's date--------------------
        today=today.plusYears(1);                           //2024-06-02-Biz yazarken onlerine 0 koymuyoruz
        System.out.println(today);                                     //print edince  06 , 02 gibi yazmis

        System.out.println("---------------------------");

        LocalDate gradDate=LocalDate.of(2025,6,4);

//if original gradDate is postponed 2 years
        gradDate=gradDate.plusYears(2);                         //2027-06-04
        System.out.println(gradDate);

//----plusMonths()----returns the date after months in () added to the present LocalDate object's date------------------
//if gradDate is postponed 7 more months:
        gradDate=gradDate.plusMonths(7);
        System.out.println(gradDate);                                     //2028-01-04

//----plusWeeks()----returns the date after weeks in () added to the present LocalDate object's date--------------------
//if gradDate is postponed 7 more weeks:
        gradDate=gradDate.plusWeeks(7);                       //7x7=49 days will be added on the old date
        System.out.println(gradDate);                                    //2028-02-22

//----plusDays()----returns the date after days in () added to the present LocalDate object's date----------------------
//if gradDate is postponed 100 more days:
        gradDate=gradDate.plusDays(100);
        System.out.println(gradDate);                                   //2028-06-01

System.out.println("-----------------------------------------------");
//----minusYears()-----returns the date after years in () subtracted from the present LocalDate object's date-----------
        LocalDate yourBirthday=LocalDate.of(2005,4,1);                     //Birthday of a person
        System.out.println(yourBirthday);                                                         //2005-04-01

//if his brother was born 2 years before
        LocalDate brotherBirthday=yourBirthday.minusYears(2);
        System.out.println(brotherBirthday);                                                      //2003-04-01

//if his brother was born 2 years and 3 months before his birthday
        brotherBirthday=yourBirthday.minusYears(2).minusMonths(3);   //2003-01-01
        System.out.println(brotherBirthday);

//----minusMonths()----returns the date after months in () subtracted from the present LocalDate object's date----------
//----minusWeeks()---- returns the date after weeks in () subtracted from the present LocalDate object's date-----------
//----minusDays()------returns the date after days in () subtracted from the present LocalDate object's date------------

System.out.println("-------------------------------------------------------------------------------------------------");
LocalDate birthday1=LocalDate.of(1994,7,7);
LocalDate birthday2=LocalDate.of(1995,6,7);

//----isEquals()----returns the year of that LocalDate object-----------------------------------------------------------
//To check if the below 2 people were born on the same day
        boolean isSameDay=birthday1.equals(birthday2);
        System.out.println(isSameDay);


    }
}
