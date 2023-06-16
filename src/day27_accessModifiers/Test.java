package day27_accessModifiers;

public class Test {
    public static void main(String[] args) {

        //new StaticInitializationBlock();

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

//----Asagisi Test for AccessModifiers Class / Variables For same package ----------------------------------------------

        System.out.println(AccessModifiers.publicData);           //public is accessible within same package
        System.out.println(AccessModifiers.protectedData);        //protected is accessible within same package
        System.out.println(AccessModifiers.defaultData);          //default is accessible within same package
        //System.out.println(AccessModifiers.privateData);        //private is not accessible within same package

//----Asagisi Test for AccessModifiers Class / Constructors For same package -------------------------------------------

        new AccessModifiers();                                     //public constructor accessible in the same package
                                                                   //protected constructor accessible in the same package
                                                                   //default constructor accessible in the same package
                                                                   //private not accessible in the same package

//----Asagisi Test for AccessModifiers Class / Methods For same package ------------------------------------------------

        AccessModifiers.publicMethod();                            //All accessible other than the private in the same p.
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
       // AccessModifiers.privateMethod();                          //private not accessible in the same package



//----Asagisi benim Java Short'daki ornegi test etmek icin yaptigim bolum /ders degil-----------------------------------

       //System.out.println(AccessModifiers.n1);      Even the AccessModifiers Class in the same package can Not call
                                                      //n1 bec. it is private
        System.out.println(AccessModifiers.n2);       //n2 has default modifier so can be called in the same package

        System.out.println(AccessModifiers.n3);       //n3 has public modifier so can be called in the same package


       //AccessModifiers.method1();                   method1 can Not be called bec. it has private modifier

        AccessModifiers.method2();                    //method2 has default modifier so canbe called in the same package

        AccessModifiers.method3();                   //method3 has default modifier so can be called in the same package


    }
}
