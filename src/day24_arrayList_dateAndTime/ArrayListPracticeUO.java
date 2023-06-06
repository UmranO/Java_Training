package day24_arrayList_dateAndTime;
import day17_customClass.Employee;                //since Employee Class is from another package we need to import it

import java.util.ArrayList;                       //since these Classes are from another package we need to import them
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPracticeUO {
    public static void main(String[] args){

//UO Way:Asagida direct ArrayList'in constructor'ina new k.word kullanarak 5 tane object'i toplu olarak asList ile ekledim
        ArrayList<Employee> employees=new ArrayList<>(Arrays.asList(new Employee(),new Employee(),new Employee(),new Employee(),new Employee() ));

//M Way:Once ArrayList'i yarattmis sonra adAll ile eklemis:
        ArrayList<Employee> employees1=new ArrayList<>();
        employees1.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

//Sonra employees'den her index'teki Employee object'i retrieve edip set Info ile set ettik.


        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("1.1 Write a program that can display the name and job title of each employee");

        for(Employee each:employees){
            System.out.println("Employee name = " + each.name+",\t Job Title= "+each.jobTitle);
        }

        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("1.2 Write a program that can display the names of Java Developers");

        for(Employee each:employees){
            if(each.jobTitle.equals("Java Developer")){
                System.out.println(each.name);
            }
        }

        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("1.3 Write a program that can display the maximum and minimum salary");

        ArrayList<Double> salary=new ArrayList<>();
        for (Employee each: employees){
            salary.add(each.salary);
        }
        System.out.println("Max Salary: "+ Collections.max(salary));
        System.out.println("Min Salary: "+ Collections.min(salary));

        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("1.4 Create two Arraylists named femaleEmployees and maleEmployees, write a program that can add all" +
                " the female employees and male employees to the femaleEmployees and maleEmployees Arraylists");

        ArrayList<Employee> femaleE=new ArrayList<>();
        ArrayList<Employee> maleE=new ArrayList<>();

        for(Employee each:employees){
            if(each.gender=='F'){femaleE.add(each);}
            else {maleE.add(each);}
        }
        System.out.println(femaleE);
        System.out.println(maleE);
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