package day26_statics.studentTask;
import java.util.ArrayList;

public class StudentsGroup {

    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>(); //1st way of instantiating the ArrayList object

    public StudentsGroup(String groupName, int groupId) {   //creates the StudentsGroup object by setting the groupName
                                                            //and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        // students = new ArrayList<>();    size : 0        //2nd way of instantiating the ArrayList object
    }
//--addStudent(Student student)-----takes one Student object, and adds it to the ArrayList of students------------------

    public void addStudent(Student student){
        students.add(student);
    }

//--addStudent(String name, int age, char gender, String id)-----takes name, age, gender, id of Student info, creates
//--student object by using the given info that are required for Student creation
//--then adds the student object to the ArrayList of Students

    public void addStudent(String name, int age, char gender, String id){
        //Student student = new Student(name, age, gender, id);          -unnecessary, we can create the object as below
        students.add( new Student(name, age, gender, id) );
    }

//--removeStudent(String id)-----removes the Student object with the specified id from the ArrayList-students-----------

    public void removeStudent(String id){
        students.removeIf(p->p.id==id);
    }

//--toString()----------------------------------------------------------------------------------------------------------

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +    //modified the toString()-instead of printing all the
                '}';                                           //Students I want to print the # of Students.
    }

}
/*
2. Create a custom class named StudentsGroup
   -Attributes: groupName, groupId, students (ArrayList<Students>)
   -Add a constructor that can set the groupId and groupName initialize students arraylist in the constructor's body

    Methods:
   -addStudent(Student): adds the specified student to the students arrayList
   -removeStudent(id): removes the student with the specified id from the students arraylist
   -toString(): displays the groupName, groupId and total number of students when a group object is passed in the print
    statement
 */