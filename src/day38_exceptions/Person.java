package day38_exceptions;
import java.util.InputMismatchException;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);                                                   //age&name can be initialized in their Setters
        setAge(age);
        if(!(gender =='M' || gender =='F')){                             //if the gender is invalid
            throw new RuntimeException("Invalid gender: "+gender);       //throws RuntimeException and crash the program
        }                                                          //gender's final that's why it has to be initialized
        this.gender = gender;                                      //in the constructor. It also has some conditions
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age == 0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 150){                                           //if the given age is invalid
            throw new RuntimeException("Invalid age: "+age);                //throw runtime exception, and crash program
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}