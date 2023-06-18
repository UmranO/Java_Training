package day28_encapsulation.encapsulation;

public class Test {
    public static void main(String[] args) {

        Student student=new Student();
      //student.age=-200;                   if the access mod. is public in the Custom Class any value can be set which
                                            //is not good we want control on our data

      //student.age;                        If the instance variable private the only way we can get the age is through
                                            //the getter

        student.getAge();
        System.out.println(student.getAge());          //=>0 bec. it is the default value

        student.setAge(28);                            //28 is the argument & it will be assigned to this parameter age
        System.out.println(student.getAge());          //=>Now it will print 28 bec. we set it in line15

        System.out.println("Test Completed");

        System.out.println(student.getName());
        student.setName("Ali9");                       //"Invalid name: Ali9"


        System.out.println("Test completed");         //If No problem it should complete codes above and print this
    }
}
