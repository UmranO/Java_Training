package day28_encapsulation.encapsulation;

public class Student {

  //  public int age;
    private int age;

  //getter is READ ONLY
    public int getAge(){
      if (age==0){
        System.err.println("Age has not bee set");
        System.exit(1);}
      return age;
    }

  //setter is WRITE ONLY
                                            //Whatever argument passed to setAge() in the Test Class will be assigned to
  // public void setAge(int age){            the parameter age
  // this.age=age;                           then it will be assigned to the instance variable age


//If we want to add some conditions before we set the argument to the instance variables

    public void setAge(int age){

    if(age<-1 || age>100){
      System.err.println("Invalid Age: "+age);
      //return;                                     is used to exiting the current method
      System.exit(1);                       //is used for exiting the program. If invalid arg. is given program
    }                                             //gets terminated noneof the following code will be executed. It will
    this.age=age;                                 //stop there.status code 1 means the program terminated with a problem

    }
}

