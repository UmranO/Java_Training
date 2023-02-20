package day08_ternary_switch;

public class SwitchStatementIntro2 {
    public static void main(String[] args){

        int n = 25;
                                                //INSIDE THE () you need to pass the expression
        switch(n){                              //whichever expression we pass it's going to compare its value with the
                                                //cases included in the switch

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
