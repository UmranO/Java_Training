package day27_accessModifiers;

public class AccessModifiers {
//----Variables--------------------------------------------------------------------------------------------------------
public static int publicData=200;
protected static int protectedData=300;
static int defaultData=400;
private static int privateData=500;
//----Constructor-------------------------------------------------------------------------------------------------------

//public AccessModifiers(){                             //Constructor with public access modifier
// }
//-----------------------
// protected AccessModifiers(){                         //Constructor with protected access modifier
// }
//-----------------------
//    AccessModifiers(){                                //Constructor with default access modifier
//    }
//-----------------------
//private AccessModifiers(){
//}

//----Method--------------------------------------------------------------------------------------

    public static void publicMethod(){
        System.out.println("Public");
    }
    //--------------------
    protected static void protectedMethod(){
        System.out.println("Protected");
    }
    //--------------------
    static void defaultMethod(){
        System.out.println("Default");
    }
    //--------------------
    private static void privateMethod(){
        System.out.println("Private");
    }


    public static void main(String[] args){

    System.out.println(publicData);                     //public datails accessible within the same class
                                                        //same package testini Test Class'da yaptim
                                                        //different package test:utilities/Test Class'da yaptim

    System.out.println(protectedData);                  //protected is accessible within  the same Class
                                                        //other ()s within the same class has access to protected

    System.out.println(defaultData);                    //default is accessible within  the same Class

    System.out.println(privateData);                    //private is accessible within  the same Class

        System.out.println("-----------------------------");

    new AccessModifiers();                              //public constructor accesible in the same class

        System.out.println("-----------------------------");

        publicMethod();                                 //All the methods are accessible in the same Class
        protectedMethod();
        defaultMethod();
        privateMethod();

}


//Asagisi JavaShort icin yaptim Sinifta yapilmadi. Tested in Test3ForAccessModifiers Class under Utilities
//----Variables--------------------------------------------------------------------------------------------------------

    private static int n1=100;          //private modifier
    static int n2=200;                  //default modifier
    public static int n3;               //public modifier


//----Methods-----------------------------------------------------------------------------------------------------------

    private static void method1(){ System.out.println("method with private access modifier");}       //private modifier
    static void method2(){System.out.println("method with default access modifier");}                //default modifier
    public static void method3() { System.out.println("method with public access modifier");}        //public modifier



}
