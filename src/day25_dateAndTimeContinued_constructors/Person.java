package day25_dateAndTimeContinued_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean ismarried;
    public boolean isEmployeed;

    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean ismarried, boolean isEmployeed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.ismarried = ismarried;
        this.isEmployeed = isEmployeed;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                ", ismarried=" +  ismarried +
                ", isEmployeed=" + isEmployeed +
                '}';

    }

    public void eat(String food){
        System.out.println(name + " is eating "+ food);
    }

    public void sleep(){
        System.out.println(name + " is sleeping ");
    }

    public void drink(String drink){
        System.out.println(name + " is drinking "+ drink);
    }

//--------TestPerson-------------------------------------------------------------------

    public static void main(String[] args) {
        Person p1 = new Person("U",52,'F',LocalDate.of(1970,2,13),true,true);
        Person p2= new Person("A",25,'M',LocalDate.of(1969,4,17),true,true);

        System.out.println(p1);
        System.out.println(p2);

        p1.eat("Burger");
        p2.drink("Coke");
        p1.sleep();


    }

}
