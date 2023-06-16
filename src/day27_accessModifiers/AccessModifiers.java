package day27_accessModifiers;

public class AccessModifiers {                                      //Bunu JavaShort icin yaptim Sinifta yapilmadi

//----Variables--------------------------------------------------------------------------------------------------------

    private static int n1=100;          //private modifier
    static int n2=200;                  //default modifier
    public static int n3;               //public modifier


//----Methods--------------------------------------------------------------------------------------------------------

    private static void method1(){ System.out.println("method with private access modifier");}       //private modifier
    static void method2(){System.out.println("method with default access modifier");}                //default modifier
    public static void method3() { System.out.println("method with public access modifier");}        //public modifier


}
