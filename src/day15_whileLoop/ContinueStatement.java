package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args){

        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                continue;}
            System.out.println(i);                              //Bunu if statement'da verirsen erisilmez oluyor!
        }                                                       //If we don't want this statement to be executed in a
        //specific iteration. eg skip this sout in iteration 4
        System.out.println("----------------------------------------------------------------------------------------");

        //Display all the odd #s btw 10 ~ 20

        for (int i = 10; i <21 ; i++) {
            if (i%2==0) {continue;}                            //if i is even skips the current iteration
            System.out.println(i);
        }
        System.out.println("Asagidakiler benim alternatifler--------------------------------------------------------");

        for (int i = 10; i <=20 ; i++) {                       //between dediginde o sayiyi da dahil ediyor
            if (i%2!=0) System.out.println(i);
        }
        System.out.println("-----------------------------");

        for (int i = 11; i <=20 ; i+=2) {
            System.out.println(i);
        }
        System.out.println("Asagidakiler M devam------------------------------------------------------------------");
                                                                  //If we want to skip printing B & E
        for (char i='A'; i<='G'; i++){
            if (i=='B' || i=='E'){continue;}
            System.out.println(i);
        }
        System.out.println("----------------------------------------------------------------------------------------");
//
//        for (int i=0; i< 3; i++)
//            System.out.println("Hello World");     //if it has only 1 statement in its body it can be given without {}
//            System.out.println("Hello Cydeo");     //This sout is not in for loop's body now when no {} is present so
//                                                   //this statement won't be repeated 3 times will only be printed once
//
        System.out.println("----------------------------------------------------------------------------------------");
        // find the sum of all the even number between 50 ~ 100

        for (int i = 50; i < 101; i++) {                            //Alternative-1 to display even numbers btw 50 ~100
            if (i % 2 == 0) {
                System.out.print(i +" ");
            }
        }
        System.out.println();                                      //To append a new line otherwise it will print back
                                                                   //to back
        System.out.println("---------------------------------");

        //50, 52, 54, 56 ...... 100                                //Alternative-2 to display even numbers btw 50 ~100
        for (int i = 50; i < 101; i += 2) {                        //Bunda 2'ser ekleyerek ilerliyoruz.
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("----------------------------------------------------------------------------------------");


        int sum=0;
        for (int i = 50; i <=100 ; i++) {
            if (i%2!=0) {                                          //if the i's value is odd #
                 continue;}                                        //skip it
            else {sum+=i;}

        }System.out.println(sum);
   
   
    }
}
