package day28_encapsulation.encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestPerson {
    public static void main(String[] args) {

        Person p1=new Person("Umran",52,'M', LocalDate.of(1970,2,13));
        System.out.println(p1);

        System.out.println(p1.getName());
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/Y");
        System.out.println(p1.getDateOfBirth().format(df));
    }
}
