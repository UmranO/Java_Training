package day22_wrapperClasses_ArrayList;

public class WrapperClassMethods {
    public static void main(String[] args){

        String str="20";                //Since 20 is btw "" it will be treated as String
        System.out.println(str+1);      //=>201 But if we want this data 20 to be treated as a # we have to decide what
                                        //kind of # we want it to be treated as? -integer. When it comes to integer we
                                        //have 2 options to convert this String to:
                                        //1)primitive int or 2)Wrapper Class Integer

//  Integer num1 = Integer.parseInt(str); // autoboxing
        int num = Integer.parseInt(str);

        System.out.println(num + 1);

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);

        System.out.println("------------------------------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("------------------------------------------");

        String x = "false";                     //Both the parse & the valueOf ()s are caseInsensitive-kontrol ettim
                                                //Since boolean is either true or false String can't be anything other
        boolean r1 = Boolean.parseBoolean(x);   //than true or false

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("------------------------------------------");

        char ch = '$';

        boolean isDigit =Character.isDigit(ch);

        boolean isLetter = Character.isLetter(ch);

        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        boolean isUpperCaseLetter = Character.isUpperCase(ch);

        boolean isSpecialChar = !Character.isLetterOrDigit(ch); // special character

        System.out.println("isDigit = " + isDigit);

        System.out.println("isLetter = " + isLetter);

        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);

        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);

        System.out.println("isSpecialChar = " + isSpecialChar);


        System.out.println("------------------------------------------------");

        String string = "a1b2c3d4e5";                //From the String we have to get every single digit and when we get
                                                     //the digit as a character we have to convert it to the number.
                                                     //After they are converted to number we can find their sum.
        int sum = 0;
                                                     //*For String we can not use for each loop. In order to use for
        for (char each : string.toCharArray()) {     //each loop we have to have a Data Structure.From the String given
                                                     //we call the toCharArray() so that we have an Array which contains
            if(Character.isDigit(each)){             //each character of the String including all the digits, all the
                sum += Integer.parseInt(""+each); //letters...So now we can iterate this Array with for each loop.
            }                                        //This is how you can Apply for each loop to a String.

        }

        System.out.println("sum = " + sum);


    }

}
