package day11_string;

public class StringMethods3 {
    public static void main(String[] args) {

        String wordW = "";

        boolean r1 = wordW.isEmpty();

        System.out.println(r1);

        // -------------------------

        String str = "        ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //------------------------------------
        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str1 == str2);

        System.out.println( str1.equals(str2) );

        String str3 = new String("cydeo");

        System.out.println( str2.equals(str3));

        //------------------------------------

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2));           //false          to get the exact one
        System.out.println(s1.equalsIgnoreCase(s2)); // true          to get the same letters ignoring if capital or NOT

        //------------------------------------
        // yes , Yes, yES, YeS  ===> yes
        String students = "Hasan Naran Sumeye Nataliia";

        boolean hasAhmed = students.contains("Ahmed");                 //contains() can NOT ignore case sensitivity

        System.out.println("hasAhmed = " + hasAhmed);


        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");    //contains() can NOT ignore case sensitivity TO
        //   boolean hasJava = sentence.equalsIgnoreCase("java");     //overcome this we can 1st you can create the
                                                                      //temporary value of the sentence which contains
        System.out.println("hasJava = " + hasJava);                   //the lower version of sentence with tolowerCase()

        //----------------------------------------------------------




    }

}

