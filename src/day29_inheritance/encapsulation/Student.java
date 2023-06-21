package day29_inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);                                          //Instead of setting the instance variables we are
        setAge(age);                                            //calling the setters so that we ca apply our conditions
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }


    public String getName(){                                      // READ ONLY
        /*                                                        // Since insatance var.-name is private the only way to
        if(name == null){                                         // read it through the getter.
            name = "Unknown";
        }
         */
        return name;
    }

    public void setName(String name){                             // WRITE ONLY
        /*                                                        // Since insatance var.-name is private if you need to
        if(name.isEmpty()){                                       // set this outside the class the only way is to go
            System.err.println("Invalid student name");           // through the setter
           // return;
            System.exit(1);
        }
        */
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 0){                                          //Placed this condition on top of the other bec. if this
            System.err.println("Age can not be negative");    //true we don't even need to cjheckl the other one.
            System.exit(1);
        }

        if(age < 5 || age > 90){
            System.err.println("Invalid student age "+age);
            System.exit(1);
        }


        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if(gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else{
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if(isValid) {
            this.grade = grade;
        }else{
            System.err.println("Invalid grade: "+grade);
            System.exit(1);
        }

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name +" is studying at "+schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }



}

/*
1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
                        1. age can not be less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()
 */
