package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

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

//====Additional task:==================================================================================================
//Create all the groups-2-5
//And at the end come up with a StudentsGroup[] groups. In this Array we should have all the groups

        //---Adding Student by passing an Array of Student-------------------
        StudentsGroup group2=new StudentsGroup("GhostBusters",2);  //Created the StudentsGroup object

        Student s1=new Student("A",55,'M', "G2");               //Created the objects
        Student s2=new Student("B",35,'M',"G3");
        Student s3=new Student("C",40,'F',"G4");

        Student[] students2= {s1,s2,s3};                                              //Created the Array of Students to

        group2.addStudent(students2);                                                 //the group2
        System.out.println(group2);

        System.out.println("----------------------------------------");

        StudentsGroup group5=new StudentsGroup("Havanas",5);

        Student d1=new Student("PAs",65,'F',"H1");
        Student d2=new Student ("Orkun",16,'M',"H2");
        Student d3=new Student("Zeynep", 42,'F',"H3");
        Student d4=new Student ("Ozy",18,'M',"H2");
        Student d5=new Student("Pervin", 17,'F',"H3");

        Student[] arrSt={d1,d2,d3};

        group5.addStudent(arrSt);
        System.out.println(group5);


        System.out.println("-------------------------------------------------------------------------------------");

        //---Adding Student by passing a Student Object------------------------
        StudentsGroup group3=new StudentsGroup("Pickles",3);

        Student sg1=new Student("Lale",25,'F',"P1");
        Student sg2=new Student("Berk",37,'M',"P2");
        Student sg3=new Student("Selami",63,'M',"P3");
        Student sg4=new Student("Ayse",37,'F',"P4");

        group3.addStudent(sg1);
        group3.addStudent(sg2);
        group3.addStudent(sg3);
        group3.addStudent(sg4);
        System.out.println(group3);

        System.out.println("-------------------------------------------------------------------------");

        //---Adding Student by passing arguments which are the requirement of creating a Student-----

        StudentsGroup group4=new StudentsGroup("Loyals",4);

        group4.addStudent("El",78,'F',"L1");
        group4.addStudent("Kemal",63,'M',"L2");
        group4.addStudent("Utku",21,'M',"L3");
        group4.addStudent("Lal",23,'F',"L4");

        System.out.println(group4);

        System.out.println("-------------------------------------------------------------------------");

        StudentsGroup [] allGroups= {group1,group2,group3,group4,group5};
        System.out.println(Arrays.toString(allGroups));

        System.out.println("-------------------------------------------------------------------------");
        //---Remove Student by Student id-------------------------------------------------------------------------------

        group3.removeStudent("P4");
        System.out.println(group3);
        System.out.println("-------------------------------------------------------------------------");

        for (StudentsGroup eachG : allGroups) {
            System.out.println("Group Id="+eachG.groupName+" - Group Id="+eachG.groupId+":");
            for (Student herStudent:eachG.students){
                System.out.println(herStudent.name);
            }System.out.println();
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
And at the end come up with a StudentsGroup[] allGroups. In this Array we should have all the groups that way all the
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
