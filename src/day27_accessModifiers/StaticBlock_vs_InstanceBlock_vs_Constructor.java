package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){           //Constructor
        System.out.println("Constructor");
    }
//-----------------------------------------------------------------------------------------
    {                                                              //Instance Block
        System.out.println("Instance Block");
            }

//-----------------------------------------------------------------------------------------
    static{                                                        //Static Block
        System.out.println("Static Block");
        }

//-----------------------------------------------------------------------------------------
    public static void main(String[] args) {                       //main method

        System.out.println("Main Method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();
        new StaticBlock_vs_InstanceBlock_vs_Constructor();
    }
}
