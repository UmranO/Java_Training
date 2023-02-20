package day08_ternary_switch;

public class SwitchIntro {
    public static void main(String[] args){
        char grade='A';
 /*
        A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
         */

        /*
        String result;
        if (grade == 'A'){
            result = "Excellent";
        }else if (grade == 'B'){
            result = "Great Job";
        }else if(grade == 'C'){
            result = "Good";
        }else if(grade == 'D'){
            result = "Passed";
        }else {
            result = "Failed";
        }
        System.out.println(result);
        System.out.println("----------------------------------");
*/

                                        //in switch; the data that we have, can be directly passed bec. switch statement
        switch(grade){                  //is used for finding the exact, matching data.
                                    //when we pass this grade here now the switch statement will look for any of the
                                    //case block that have the same value as this expression(grade) that we passed in
                                    //the switch.
            case 'A':               //Every case should have a value and the data type of the case value should be same
                      //as the expression you are giving. eg Data Type of grade is char so case value alsohas to be char
                System.out.println ("Excellent");
                break;                              //break statement means when this case blocks gets executed this
            case 'B':                               //switch statement gets terminated
                System.out.println ("Great Job");
                break;
            case 'D':
                System.out.println("Passed");       //order of the blocks don't matter. Any of them can be placed anywhere
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'F' :
                System.out.println("Invalid");
                break;
            default: System.out.println("Invalid"); //If no default & none of the blocks can be executed if the
                                                    //expression is not matching any of those blocks. If you want a code
                                                    //to be executed if none of those blocks aren't matching then you'll
                                                    //need the default block in the switch.

                                                    //We don't need to give a break st.if it is the last block
                                                    //It won't matter if it is a case block or default block
        }

    }
}
/*switch (grade){
     char grade='Q';

        case 'B':
        System.out.println("Great Job");
        break;

        case 'A':
        System.out.println("Excellent");
        break;

        default:
        System.out.println("Invalid");

        case 'C':
        System.out.println("Good");
        break;

        case 'D':
        System.out.println("Passed");
        break;

        case 'F':
        System.out.println("Failed");
        break;

       If it doesn't match any of the blocks it will execute the default block but if we place the default not at the
       end and don't put a breajk statement then it will go the next block and execute that too. If that has a break
       statement then it will exit the switch but we'll the the outcome of both the default and the following block

       In the above example it will print both the Invalid and Good on the console
       Preferred way is to put the default at the very end & you don't need to give the break st. then
        }

*/
