package day19_array;
import java.text.DecimalFormat;
public class DecimalFormatPractice {
    public static void main(String[] args) {

        double n1=10.587654;                    //decimal formatter rounds up part after the pattern
                                                //In Java there is a DecimalFormat Class which is presented in  order to
                                                //round up we can create the DecimalFormat Class object.
        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.println(  df.format(n1)  );
    }
}
