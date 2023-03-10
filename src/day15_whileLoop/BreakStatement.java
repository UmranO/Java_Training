package day15_whileLoop;

public class BreakStatement {
public static void main(String[] args){
                                                                //if we want this to be terminated before printing 6->
    for (int i = 0; i < 10; i++) {
        if (i==6) {break;}                                      //if i's value reaches 6
        System.out.println(i);                                  //exits the loop
    }


    System.out.println("----------------------------------------------------------------------------------------");
                                                                //if we want this to be terminated after printing J->
    for (char i = 'A'; i <='Z' ; i++) {
        System.out.println(i);
        if (i=='J') break;
    }

     System.out.println("----------------------------------------------------------------------------------------");
                                                                //test break statement in an iinfinite loop
    //  for(;;){}                                                 this creates an infinite loop

    for (;;){
        System.out.println("Hello");                            //Hello will be printed inifinite times but if we give
        break;                                                  //break statement it terminates even an infinite loop
    }                                                           //After Hello is printed once the loop is terminated

    for (char i = 'A'; i <= 'Z'; i++){

        if(i == 'J'){
            System.out.println("Loop is terminated");
            break;
            //System.out.println("Loop is terminated");          Since after the break st this statement is unreachable
        }

        System.out.println(i);

    }

}

}
//break statement is used for forcefully exiting the loop!