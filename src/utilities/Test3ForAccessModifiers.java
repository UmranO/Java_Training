package utilities;
import day27_accessModifiers.AccessModifiers;    //To use AccessModifier Class's member in diff.package we have to import

public class Test3ForAccessModifiers {
    public static void main(String[] args) {












//Bu kisimi JavaShort icin yaptim (Sinifta yapilmadi)--Kendi yaptigim AccessModifiers Class'in other package testi
//----Variables--------------------------------------------------------------------------------------------------------
        //System.out.println(AccessModifiers.n1);    Even the AccessModifiers Class imported since private we can Not
                                                     //call n1 in another package private is not visible in another pack.

        //System.out.println(AccessModifiers.n2);    //n2 has default modifier so can Not be called in another package
                                                     //bec not visible in another package

        System.out.println(AccessModifiers.n3);      //n3 has public modifier so can be called in another package

//----Methods--------------------------------------------------------------------------------------------------------
        //AccessModifiers.method1();                  method1 can Not be called bec. it has private modifier

        //AccessModifiers.method2();                  method2 has default modifier /can't be called in the same package

        AccessModifiers.method3();                   //method3 has default modifier so can be called in the same package


    }
}
