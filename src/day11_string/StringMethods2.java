package day11_string;

public class StringMethods2 {
    public static void main(String[] args){

//----replace()-------------------------------------------------------------------------------------------------
//replaces all of the matching, (1st the String we want to place is given 2nd the value we want to change it with)


        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");      //All 3 Pythons will be replaced with Java

        System.out.println(sentence);

        //----------------------------------------------------------

//instead of a String char values also can be replaced
        String word = "java";
                                                                     //'' chars are replaced
        // word = word.replace('a' , 'e');  //"jeve"        //even if you have a single char you want to replace you can

        word.replace("a", "e");           //always give it as a string-for now stick wth this one

        System.out.println(word);

//----replaceFirst()-------------------------------------------------------------------------------------------------
//replaces first matching from left,(1st the String we want to place is given 2nd the value we want to change it with)

        String sentence2 = "I love Java, Java is cool";                     //All 2 Pythons will be replaced with Java

        //sentence2 = sentence2.replace("Java", "Python");                  //Only 1st Python will be replaced with Java

        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2);                                        //Console: I love Python , Java is cool
//----------------------------------------------------------

        String sentence3 = "Java is fun, Java  is cool, Java is amazing";

        //sentence3 = sentence3.replace("Java", "Python");
        sentence3 = sentence3.replaceFirst(", Java", ", Python");

        System.out.println(sentence3);


//----substring()-------------------------------------------------------------------------------------------------
        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 10 + 1);      //Last character is NOT included in substring so +1

        System.out.println(languageName);

        //----------------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        //                  0123456789

        String today = sentence5.substring(9, 14+1);

        System.out.println(today);

        //----------------------------------------
        String email = "CydeoSchoolJavaProgramming@yahoo.com";                     //What is the Domain of this email?
        //email=email.substring(email.indexOf("@")+1,email.lastIndexOf('.'));        Domain is always in between @ and .
                                                                                   //You should take the last . there
                                                                                   //might be bunch of
        int beginning = email.indexOf("@") + 1;
        int ending = email.lastIndexOf('.');

        String domain =  email.substring(beginning, ending);

        System.out.println(domain);

        //----------------------------------------
//M-----------------------------------------------
        String sentence6 = "I love Java programming";

        // String r1 = sentence6.substring(7, sentence6.length());

        String r1 = sentence6.substring(7);

        System.out.println(r1);

//UO----------------------------------------------
        sentence6 = "I love Java programming";                           // create a substring "Java programming"

        sentence6=sentence6.substring(sentence6.indexOf("Java programming"));

        System.out.println(sentence6);

        System.out.println("------------------------------------");

        String sentence7 = "Today is Sunday, Tomorrow is Monday";



    }
}
