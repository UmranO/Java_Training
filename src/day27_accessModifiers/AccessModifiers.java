package day27_accessModifiers;

public class AccessModifiers {

public static int publicDate=200;


public static void main(String[] args){

    System.out.println(publicDate);                     //public data can be accessed in the same class
                                                        //same package test:Test different package test:utilities/Test



}



//Asagisi JavaShort icin yaptim Sinifta yapilmadi. Tested in Test3ForAccessModifiers Class under Utilities
//----Variables--------------------------------------------------------------------------------------------------------

    private static int n1=100;          //private modifier
    static int n2=200;                  //default modifier
    public static int n3;               //public modifier


//----Methods--------------------------------------------------------------------------------------------------------

    private static void method1(){ System.out.println("method with private access modifier");}       //private modifier
    static void method2(){System.out.println("method with default access modifier");}                //default modifier
    public static void method3() { System.out.println("method with public access modifier");}        //public modifier


}
