package day08_ternary_switch;

public class SwitchStatementMonths {
    public static void main(String[] args){

        int nu = 14;

        String month = "";

        switch(nu){
            case 1 :
                month="Jan";
                break;
            case 2 :
                month="Feb";
                break;
            case 3 :
                month="Mar";
                break;
            case 4 :
                month="Apr";
                break;
            case 5 :
                month="May";
                break;
            case 6 :
                month="Jun";
                break;
            case 7 :
                month="Jul";
                break;
            case 8 :
                month="Aug";
                break;
            case 9 :
                month="Sep";
                break;
            case 10 :
                month="Oct";
                break;
            case 11 :
                month="Nov";
                break;
            case 12 :
                month="Dec";
                break;
            default:
                month="Invalid month";
        }
 System.out.println(month);

    }
}
