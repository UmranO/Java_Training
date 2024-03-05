package day38_exceptions;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 90, 'M'); //No exceptions since all the arguments are
                                                                          //in line with the conditions
        System.out.println(person1);


        // person1.setAge(-25);                                          //will throw an exception-invalid argument:-25


        System.out.println(person1);

    }

}