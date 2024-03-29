package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1, 25));

        System.out.println(person);

        person.breath();                                           //the output will be same for all the breath() called

        System.out.println("----------------------------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1989, 2, 5),
                "Accountant", 100000);

        System.out.println(employee);

        employee.breath();                                         //the output will be same for all the breath() called

    }
}