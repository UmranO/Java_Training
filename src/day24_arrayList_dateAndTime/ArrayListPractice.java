package day24_arrayList_dateAndTime;
import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListPractice {
    public static void main(String[] args){

//M Way:Once ArrayList'i yarattmis sonra adAll ile eklemis:
        ArrayList<Employee> employees=new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

//Sonra employees'den her index'teki Employee object'i retrieve edip set Info ile set ettik.


        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

//We need to set the informations of every single Employee objects & we need to set them separately. So we need to call
//setInfo(). To set the 1st Employee object we need to get the 1st Employee object from this ArrayList. To get the
//elements from the ArrayList we need to use get() & this get() will return that element that you have at a specified
//index. So at the index 0 in this ArrayList we have Employee object. (Not a String or Integer..) So this get() returns
//Employee object. Since it is returning Employee object from the object we can its instance()-here setInfo()
//Since 5 diff. elements we need to set them separetely 5 times, each time we can give different data for name, age,
//gender, jTitle, salary & id.
//To complete task we need to reach every element of the ArrayList

System.out.println("--------------------------------------------------------------------------------------------------");
System.out.println("1.1 Write a program that can display the name and job title of each employee");

        for (Employee each : employees) {        //variable each referencing to each Employee object of the ArrayList
            System.out.println(each.name + "\t:\t" + each.jobTitle);    //to reach to each element we need to use a loop
        }

System.out.println("--------------------------------------------------------------------------------------------------");
System.out.println("1.2 Write a program that can display the names of Java Developers");

        for (Employee each : employees) {
            if(each.jobTitle.equals("Java Developer")){           //if the job title of the employee is Java Developer
                System.out.println(each.name);                    //prints the name of the employee
            }
        }

System.out.println("--------------------------------------------------------------------------------------------------");
System.out.println("1.3 Write a program that can display the maximum and minimum salary");

double max=employees.get(0).salary;
double min=employees.get(0).salary;

        for (Employee each: employees){
            if (each.salary>max) {max=each.salary;}
            if (each.salary<min) {min=each.salary;}
        }
        System.out.println("Max Salary: "+ max);
        System.out.println("Min Salary: "+ min);

System.out.println("--------------------------------------------------------------------------------------------------");
System.out.println("1.4 Create two Arraylists named femaleEmployees and maleEmployees, write a program that can add all" +
        " the female employees and male employees to the femaleEmployees and maleEmployees Arraylists");


        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            if(employee.gender == 'M'){  // if the employee is male
                maleEmployees.add(employee);
            }else{
                femaleEmployees.add(employee);
            }
        }

        System.out.println("Total number of female employees: " + femaleEmployees.size());
        System.out.println("Total number of male employees: " + maleEmployees.size());

    }
}
/*
1. Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));

	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

	        Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a program that can display the maximum and minimum salary

	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male employees to the femaleEmployees and maleEmployees Arraylists
 */