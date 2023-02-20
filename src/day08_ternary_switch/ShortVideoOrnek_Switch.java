package day08_ternary_switch;

public class ShortVideoOrnek_Switch {
    public static void main(String[] args) {

        int num = 3;
        String result = "";

        switch (num = 3) {

            case 1:
                result = "Monday";
                break;
            case 2:
                result="Tuesday";
                break;
            case 3:
                result="Wednesday";
                break;
            case 4:
                result="Thursday";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
                break;
            default:result="Invalid Day";
            break;

        }
 System.out.println (result);
    }
}

//print the name of the day