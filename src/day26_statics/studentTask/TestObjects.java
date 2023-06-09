package day26_statics.studentTask;

public class TestObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        System.out.println("----------------------------------------------------------");

        StudentsGroup group1=new StudentsGroup("Java Turtles",1);  //StudentsGroup object is created
                                                                                      //We have zero Students now
//---Adding Student by passing a Student Object-------------------------------------------------------------------------
//        group1.addStudent(student1);
//        group1.addStudent(student2);
//        group1.addStudent(student3);
//        group1.addStudent(student4);
//        group1.addStudent(student5);

//---Adding Student by passing an Array of Student----------------------------------------------------------------------

        Student[] students={student1,student2,student3,student4,student5};
        group1.addStudent(students);                                     //Array of Students added to the ArrayList of
        System.out.println(group1);                                      //StudentsGroup

//---Adding Student by passing arguments which are the requirement of creating a Student--------------------------------

        group1.addStudent("Khashayar", 34, 'M', "F35");
        System.out.println(group1);

//---Remove Student by Student id---------------------------------------------------------------------------------------

        group1.removeStudent("D43");
        System.out.println(group1);

        group1.removeStudent("E27");
        System.out.println(group1);

        System.out.println("----------------------------------------------------------");

//---To display the names of the Students from group1 the---------------------------------------------------------------
        for (Student each : group1.students) {                 //group1.students.for-to iterate the ArrayList of Student
            System.out.println(each.name+" : "+each.id);         //to get the name of each Student's name
        }





    }

}

/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentsGroup object
	            3.3 Add all the student objects to the StudentsGroup object' students list

Student Class'in objectleri create edildi
StudentsGroup object'in 3 instance variable'i var Bunlardan biri ArrayList of Student.
Constructor'i sadece groupName ve groupId'sini arguement olarak aliyor. 3.ArrayList<Student>-students'i koymadik cunku
onceligimiz object'i yaratmak-Her object'i yaratirken ArrayList'in detaylariyla ugrasmamak icin sadece o ArrayList'i
instantiate ediyoruz constructor'da veya instance variable olarak verdigimizde daha sonra da ArrayList create edildikten
sonra ayrica create ettigimiz add() ile bu ArrayList'e Student'lari ekliyoruz.
3 tane add() create ettik. Bunlardan biri Array[Student]'u argument olarak aliyor bu sekilde toplu add edebiliyoruz.


----Additional task:
Create all the groups
And at the end come up with a StudentsGroup[] groups. In this Array we should have all the groups that way all the
Students' info will be stored in a more centralized way.

        StudentsGroup group2 = new StudentsGroup("Java Turtles",  1);

        StudentsGroup group3 = new StudentsGroup("Java Turtles",  1);

        StudentsGroup group4 = new StudentsGroup("Java Turtles",  1);

        StudentsGroup[] groups = {group1, group2, group3, group4};

Practice with the addStudent() & removeStudent()s
By using the loop check that the right Students are added into those groups
Iterate this Array which has all the groups (StudentsGroup[] groups = {group1, group2, group3, group4};) & Display the
names of all the Students

 */
