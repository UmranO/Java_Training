package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Employee extends Person{                       //Since it may be a parent class we don't make this class
                                                            //final
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth);                  //we put  the conditions in the super's constructor for those
        setJobTitle(jobTitle);                             //But we have set these unique variables through this sub
        setSalary(salary);                                 //class's setters.
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() +" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" +getDateOfBirth() +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}