package day03_variables;

public class EmployeeInfo {
    public static void main(String[] args){

        /*
        System.out.println("Aaron");
        System.out.println("Aaron");
        System.out.println("Aaron");
        System.out.println("--------------------------------");
        String name = "Aaron";
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        */

        String name;                    // I declared but didn't store any value to this variable.
                                        // It is a local variable & before you use it you should assign a value to it.
                                        // Initialize it. Means you haven't store a value to this variable

        String employeeName = "Emily";  // I declared and stored the value to this variable.
        //Another way:
        String fName;
        fName="Umran";
        int age = 30;
        char gender = 'F';
        String companyName = "Google Inc";
        String employeeId = "D11";
        String jobTitle = "Scrum Master";
        int salary = 110000;
        boolean isFullTime = false;


        System.out.println(employeeName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(isFullTime);

        System.out.println("-----------------------------------------------------");


        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);

    }

}

/*
Declare the following variables with appropriate data types:
name
age
gender
companyName
employeeId
jobTitle
salary
isFullTime
 */


