package day31_inheritance;

class A{                                        //created the 2nd class with default access modifier since classes can
    public int a = 100;                         //have either public or default & in 1 class there can only be 1 public
                                                //class
}                                               //Field Hiding happens when subclass has the same variable as the parent
public class FieldHiding {                      //Then the variable in the parent will be hidden, won't be inherited to
                                                //the subclass.
    public int a =  300;

//----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        System.out.println( new FieldHiding().a );  //300 So when we call the variable from the child object we'll get
                                                    //the child class's variable.

    }

}
