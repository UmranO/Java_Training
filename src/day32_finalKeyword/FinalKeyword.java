package day32_finalKeyword;
import java.time.LocalDate;

class Student {                         //Student is parent of FinalKW if we try to add final the FinalKW' class header
                                                                   //error line underneath Student
    public void language(){                                        //secondary class with default access modifier
        System.out.println("Java Programming");                    //no final kw so can be overriden
    }

    public final void print(){                                     //since final can't be overriden in the subclass
        System.out.println("Shortcut for print is sout");          //But still be inherited to the subclass
    }
}


public class FinalKeyword extends Student {                       //subclass of Student
    public void language(){
        System.out.println("Pyton Programming");
    }
/*
    public final void print(){                                   //since final can't be overriden in the subclass
        System.out.println("Shortcut for print is sout");
    }
*/
//----constructor test--------------------------------------------------------------------------------------------------
/*
     public final FinalKeyword(){                                => compile error bec. fianl kw can't be applicable to                                                                  //constructors
      }
*/

    public static void main(String[] args) {

//----changable variable------------------------------------------------------------------------------------------------
//      char gender='M';                    //local variable declared in main method.It doesn't have final kword.
//      System.out.println(gender);         //if not final we can continuosly reassign it.
//
//      gender='F';                         //Since not final we can change it to final. Reassigning the variable by
//      System.out.println(gender);         //using =, means a new value is stored into the variable & old value is gone

//----unchangable variable----------------------------------------------------------------------------------------------

        final char gender='M';              //final prevents this variable to be reassigned.Can only be assigned 1 time
                                            //Basically we can use = operator only once for this variable.
        System.out.println(gender);         //=> M

//      gender='M';                         =>compile error

        System.out.println("----------------------------------------");

//----changable variable------------------------------------------------------------------------------------------------
//        LocalDate dateOfBirth=LocalDate.now();
//        System.out.println(dateOfBirth);
//
//        dateOfBirth=dateOfBirth.plusYears(1);
//        System.out.println(dateOfBirth);

//----unchangable variable----------------------------------------------------------------------------------------------
         final LocalDate dateOfBirth=LocalDate.now();
         System.out.println(dateOfBirth);

//       dateOfBirth=dateOfBirth.plusYears(1);          =>compile error
         System.out.println(dateOfBirth);

//----changable method--------------------------------------------------------------------------------------------------
         new Student().language();                      //=>Java Programming
         new FinalKeyword().language();                 //=>Python Programming since language() overriden in this object
                                                        //So we can override a () in the subclass
    }

}
