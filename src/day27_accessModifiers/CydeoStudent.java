package day27_accessModifiers;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;

   public static String schoolName;                    //Assume that these variables need multiple steps to set them
   public static String secretCode;


    public CydeoStudent(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    static{
       String schoolName="Cydeo School";         //We're basically saying all the objects created from CydeoSchool Class
       String secretCode="Wooden Spoon";         //are going to the same school. Only one value for all the students.
    }                                                          //Since only 1 value we only need to initialize it 1 time for all the objects


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
