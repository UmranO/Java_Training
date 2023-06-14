package day27_accessModifiers;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor");              //constructor's execution depend on the object creation
    }
//----------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        System.out.println("Main Method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();                              //static block's execution doesn't depend on the object creation
    }
    static {
        System.out.println("Static Block");             //static block is always the 1st to run & it only runs once
    }
}
