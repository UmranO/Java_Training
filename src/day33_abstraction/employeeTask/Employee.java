package day33_abstraction.employeeTask;

public abstract class Employee {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double salary;


    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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


//----common method given as abstract-----------------------------------------------------------------------------------
                                              //abstract method (uncompleted method)
    public abstract void work();              //No specific 1 implementation for all the sub classes that's why no body
                                              //To create the method without the body it has to be abstract.
                                              //To be able to use abstract() it has to be either in abstract class or an
                                              //interface.Eger abstract method hata veriyorsa static mi,final mi,private
                                              //mi, concrete class'da mi veya interface'de degil mi bunlari check
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
Employee:
		Variables:
			name, age, gender, id, jobTitle, salary ....

		Methods:
		  abstract work();
 */