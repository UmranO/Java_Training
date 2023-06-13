package utilities;
import day27_accessModifiers.Data;

public class Test {
    public static void main(String[] args){

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

    }
}
