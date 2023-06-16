package day27_accessModifiers;

public class Data {

    public int a, b, c;                             //instance variables
    public static int d,e,f;                        //Static variables

    public void method1(){                          //instance method1
        System.out.println("Method 1");
    }
    public void method2(){                         //instance method2
        System.out.println("Method 2");
    }
    public static void method3(){                  //static method3
        System.out.println("Method 3");
    }
    public static void method4(){                  //static method4
        System.out.println("Method 4");
    }
}
//Suppose we need to use some of the above members in other Classes/packages eg we can use utility package to test the
//differences btw regular import and static import