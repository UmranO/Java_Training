package day27_accessModifiers;

public class InstanceBlock {

    {                                               //Instance Block gets executed everytime when an object is created
        System.out.println("Instance block");       //just before the constructor.
    }

    public InstanceBlock(){
        System.out.println("Constructor");
    }
    //-------------------------------------------------

    public static void main(String[] args){

       new InstanceBlock();                         //Instance Block'll be executed after each object creation before
       new InstanceBlock();                         //the constructor runs
       new InstanceBlock();
    }

}
