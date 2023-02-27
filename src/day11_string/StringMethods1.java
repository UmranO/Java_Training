package day11_string;

public class StringMethods1 {
    public static void main(String[] args){
        //----toLowerCase()---------------------------------------------------------------------------------------------
        String str1 = "CYDEO SCHOOL";              //1 String obj
        str1.toLowerCase();  // "cydeo school"     //Another String obj but variable str1 can only carry 1 object
                                                   //Since last time str1 was initialized is in line 6 & has the value
                                                   //"CYDEO SCHOOL" so if we call st1 it will print "CYDEO SCHOOL"
                                                   //so if we want the lower version u have to reassign with new value
                                                   //This is bec. String is immutable. If not immutable we would't need
                                                   //reassign bec we wouln't get a new object. The existing obj would be
                                                   //converted
        str1= str1.toLowerCase();  // "cydeo school"
        System.out.println(str1);
        //-----------------------------------------

        String str2 = "java programming";
        str2=str2.toUpperCase();
        System.out.println(str2);

        //----toUpperCase()---------------------------------------------------------------------------------------------
                                                                 //Here we have 3 String objs created bif NOT reassigned
        String word = "Wooden Spoon";                            //obj1

        word = word.toUpperCase(); //"WOODEN SPOON"              //obj2

        word = word.toLowerCase(); //"wooden spoon"              //obj3-final value will be the last one stored into the
                                                                 //variable

        System.out.println(word);                                //It will still print the original obj bec. the
                                                                 //others were not stored in the original obj.

        //----trim()----------------------------------------------------------------------------------------------------

        String str4 = "          Cydeo School";                  //To remove the white space(spaeces at the begginning &
                                                                 //at the end) use trim()
        str4=str4.trim();                                        //" spaces in the "" still count as characters    "
        System.out.println(str4);

        //----indexOf()-------------------------------------------------------------------------------------------------

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w');                  //returns the index of 1st matching 'w' from left to right
                                                              //as an integer
        System.out.println(index1);

        String s1 = "I Love Java Programming";

        int firstA = s1.indexOf('a');

        System.out.println(firstA);

        int secondA = s1.indexOf("a ");                       //If we want to learn the index of the 2nd 'a' we
                                                              //should differentiate it from the others-make it unique
                                                              //like a followed by a space will give us the 2nd 'a'

        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf("a Python");               //can make it unique by passing sequence of characters in ""
                                                       //by default it will return index # of  1st char. of the sequence
        System.out.println(a2);

        int a3 = s2.indexOf("avaS");

        System.out.println(a3);

        int a4 = s2.indexOf("aS");

        System.out.println(a4);

        //----lastIndexOf()---------------------------------------------------------------------------------------------
        String w = "Java";

        System.out.println(w.indexOf('a')); //1

        System.out.println(w.lastIndexOf('a')); //3        returns the index of 1st matching 'a' from  right to left
                                                                  //as an integer (In the opposite direction of indexOf)
        String w2 = "Java Python JavaScript Cydeo Python";


        System.out.println(w2.lastIndexOf('a'));

        System.out.println(w2.lastIndexOf('P'));



    }
}
