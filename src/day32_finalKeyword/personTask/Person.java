package day32_finalKeyword.personTask;
import java.time.LocalDate;

    public class Person {

        private String name;
        private final char gender;
        private final int age;                        //formula assigned to it won't change
        private final LocalDate dateOfBirth;


        public static final int numberOfHead;

        static{
            numberOfHead = 1;
        }

        public Person(String name, char gender, LocalDate dateOfBirth) {
            setName(name);
            if( !(gender=='M' || gender == 'F')){
                System.err.println("Invalid gender: "+gender);
                System.exit(1);
            }
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
            this.age = LocalDate.now().getYear() - dateOfBirth.getYear();       //if we know the DOB then we don't have
                                                                                //to ask for the age.
        }

        public String getName() {
            return name;
        }

        public char getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void eat(){                                           //can have different implementations for different
            System.out.println(name+" is eating");                   //sub class so not declared as final.
        }

        public void drink(){
            System.out.println(name+" is drinking");
        }

        public void sleep(){
            System.out.println(name+" is sleeping");
        }

        public final void breath(){                                 //declared as final to make sure that implementation
            System.out.println(name +" is breathing");              //won't change for any sub class
        }

        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    ", dateOfBirth=" + dateOfBirth +
                    '}';
        }
    }
/*
Variables:
    name, gender, age, dateOfBirth
    numberOfHead

Methods:
    eat(), drink(), sleep()                     These methods can have different implementations in different classes
    breath()                                    BUT breath() won't have any different implementations
 */