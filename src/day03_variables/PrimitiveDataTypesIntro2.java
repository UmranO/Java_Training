package day03_variables;

public class PrimitiveDataTypesIntro2 {
    public static void main (String[] args){

        // DataType variableName = Data;

        char a = '@';
        char b = '!';
        // char ab = 'ab';  // char is for single characters so if you try to give more than 1 it will be an error

        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------------------");
        // If we want to assign a characker to a char variable we have 2 option

        char ch1 = 'A';   // 1st way is to give itself in '' OR
        char ch2 = 65;    // 2nd way is to give the # of this character (to assign the # that is representing that
                          // character) If we are using this way then no need to use ''
                          // if we assign this integer # 65 by default the data type is 65 is integer, not given in ''
                          // BUT char is not designed for integer but no errors since every char has a # & if we print
                          // it will print A not 65 bec. data type is char and it will return a single character
        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("------------------------------------");

        char ch3 = 9000;

        System.out.println(ch3);

        System.out.println("-------------------------------------------");

        int sum = 'A' + 'B';   //Data type is int so this will return the sum of the # values of these characters A & B
        //         65 + 66
        char sum1='A' + 'B';  // returns the single character at 131

        System.out.println(sum);
        System.out.println(sum1);

        // char ch4 = -100;  // you can't assign a value that is out of char's range

        System.out.println("--------------------------------------------");
        // boolean is only used for 1 purpose:for expression that can be evaluated to either true or false
        // if you try to use boolean data type for smtg else it will give an error

        // char ch4 = -100;

        // boolean r1 = 123;
        // boolean r2 = 2.5;
        // boolean r3 = "Java";

        boolean r4 = true;   // we can assign true keyword
        boolean r5 = false;  // we can assign false keyword

        //OR We can assign anything that can be evaluated to those keywords
        //<,> operators will give you either true or false. Wo't return anything other than true or false

        boolean r6 = 100 > 10; //when we write 100>10 it will be true
        boolean r7 = 0 < -1;   //when we write  0<-1  it will give either T or F so if it gives me 1 of them.
        //That means it is a boolean data type so therefore we'll be able to assign it to a boolean variable

        System.out.println(r6);
        System.out.println(r7);

    }
}
