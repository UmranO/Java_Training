package utilities;
import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;

public class Test {
    public static void main(String[] args) {

        System.out.println(Data.d);                     //With regular import we can use the statics
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        //Besides the statics we can also access the instances as well
        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

//----Asagisi Test for AccessModifiers Class / Variables For different package -----------------------------------------

        System.out.println(AccessModifiers.publicData);       // public is always accessible in different packages

        // System.out.println(AccessModifiers.protectedData); // protected is NOT always accessible in different packages
        // Only accessible in diff. package if in the subclass

        //System.out.println(AccessModifiers.defaultData);    // default is not be accessible in different packages

        //System.out.println(AccessModifiers.privateData);    // private is not accessible in different packages

//----Asagisi Test for AccessModifiers Class / Constructors For different package--------------------------------------

        new AccessModifiers();                                 // public is always accessible in different packages
        // protected not visible
        // default not visible
        // private not visible

//----Asagisi Test for AccessModifiers Class / Methods For different package -------------------------------------------

        AccessModifiers.publicMethod();                       //Only public accessible in different package
        // AccessModifiers.protectedMethod();
        // AccessModifiers.defaultMethod();
        // AccessModifiers.privateMethod();

    }
}