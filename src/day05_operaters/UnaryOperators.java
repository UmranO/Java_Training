package day05_operaters;

public class UnaryOperators {
    public static void main(String [] args){
// pre increment/decrement
        int x = 10;

        System.out.println( ++x ); //11  pre'yi uygular uygulamaz deger degisiyor
        System.out.println(x);     //11  tekrar print edersen deger hala 11


        int y = 100;

        System.out.println( --y ); //99
        System.out.println(y);     //99

        System.out.println("------------------------------------");

        // post increment/decrement
        int a = 50;

        System.out.println(a++);  // 50
        System.out.println( a );  //51


        int b = 25;

        System.out.println( b-- ); //25 it will postpone the decreasing by 1 first & print current value
        System.out.println(b);     //post means 2 steps will be executed: 1st step pass the current value then
                                   //change the value right away


        System.out.println("------------------------------------");

        int n = 30;

        int m = n++;  // m =  30, n=31  //post'tan sonraki ilk kullanim mevcut deger sonra hemen artiyor  or eksiliyor
                                        //suppose we're assigning post increment of n to m
                                        // post mean the current value is assigned to m then the 2nd step n's value
                                        // will be increased to 31
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int z = 60;

        int q = z--; // q =60, z = 59

        System.out.println("z = " + z);
        System.out.println("q = " + q);

    }

}
