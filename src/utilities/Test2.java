package utilities;
//import day27_accessModifiers.Data;
//import static day27_accessModifiers.Data.d;
//import static day27_accessModifiers.Data.method3;               //Bunda method name'den sonra () getirmedi

import static day27_accessModifiers.Data.*;

public class Test2 {
    public static void main(String[] args) {
   //     System.out.println(Data.d);

        System.out.println(d);
        method3();                                              //with static import we don't even need a class name.

        System.out.println(e);
        System.out.println(f);
        method4();

           /*

        System.out.println(a);                               //static import can be used for static members of a Class
        System.out.println(b);
        System.out.println(c);

        method1();
        method2();
        */
    }
}
