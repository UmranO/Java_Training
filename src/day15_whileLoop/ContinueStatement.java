package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args){

        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                continue;}
            System.out.println(i);                         //Bunu if statement'da verirsen erisilmez oluyor!
        }                                                      //If we don't want this statement to be executed in a
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
/*
        for (int i=0; i< 3; i++)
            System.out.println("Hello World");     //if it has only 1 statement in its body it can be given without {}
            System.out.println("Hello Cydeo");     //This sout is not in for loop's body now when no {} is present so
                                                   //this statement won't be repeated 3 times will only be printed once
*/
    }
}
