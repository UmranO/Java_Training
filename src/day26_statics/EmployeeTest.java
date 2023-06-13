package day26_statics;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1=new Employee("Umran");
        System.out.println(e1);
        System.out.println("---------------------------------------------------------------------------");

        Employee e2=new Employee("Oz",'F');
        System.out.println(e2);
        System.out.println("---------------------------------------------------------------------------");

        Employee e3=new Employee("Fatma",'F',"SDET");
        System.out.println(e3);
        System.out.println("---------------------------------------------------------------------------");

        Employee e4=new Employee("Ahmet",'M',"Engineer",135000);
        System.out.println(e4);
        System.out.println("---------------------------------------------------------------------------");

        Employee e5=new Employee("Beril","D");
        System.out.println(e5);
        System.out.println("---------------------------------------------------------------------------");

        Employee e6=new Employee("Onal","Leader",140000);
        System.out.println(e6);
        System.out.println("---------------------------------------------------------------------------");


        System.out.println();
    }
}
/*
    Class Name: Employee
        Instance variables:
        name, gender, jobTitle, salary

        1st cosntructor: initializes the name only

        2nd constructor: initializes name and gender

        3rd constructor: initializes name, gender and jobTitle

        4th constructor initializes name, gender, jobTitle, Salary

        5th constructor: initializes name, jobTitle

        6th constructor: initializes name, jobTitle, salary

        Instance methods:  toString
    */