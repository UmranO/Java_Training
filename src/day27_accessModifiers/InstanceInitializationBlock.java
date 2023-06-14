package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

                                                              //since no chance of passing parameters same value will be
//    {                                                         assigned to the instance variables
//        name = "James";
//        age = 20;
//    }

    public InstanceInitializationBlock(String name, int age) {  //BUT in the case of a constructor we can pass paramters
        this.name = name;                                       //So we can give different values to different objects
        this.age = age;
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

//        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
//        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

//        System.out.println(obj1.name);                                           //James in case of the instance block
//        System.out.println(obj2.name);                                           //James in case of the instance block

        System.out.println("---------------------------------------------------------------------");

        InstanceInitializationBlock obj3 = new InstanceInitializationBlock("James", 25);
        InstanceInitializationBlock obj4 = new InstanceInitializationBlock("Aaron", 28);


        System.out.println(obj3.name);                                              //James in presence of a constructor
        System.out.println(obj4.name);                                              //Aaron in presence of a constructor

    }



}
