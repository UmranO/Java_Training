package day14_forLoop;

public class MethodOverloadingIntro {
    //MethodOverloading
    //Multiple methods with same name but different parameters (either the data type or # of parameters are different)
    //Access modifier, specifier or return type doesn't matter! Can be same or different.
    //Only thing matters is the () name should be same but the parameters should be different

    public static void methodA(){

    }

    public static void methodA(int a){

    }

    public static void methodA(double b){

    }
    public static void methodA(int a, int b){

    }
}
