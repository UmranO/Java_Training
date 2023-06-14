package day27_accessModifiers;

public class StaticInitializationBlock {
    public static int a;
    public static double b;
    public static String c;

    //public static ExcelSheet sheet;  -----------------We need static blocks to initialize when we have variables which
                                                       //need multiple steps to set them.

    static{                                           //This is an example to show how the static block can be used to
        a=100;                                        //initialize the static variables.
        b=20.5;
        c="String";
    }

}