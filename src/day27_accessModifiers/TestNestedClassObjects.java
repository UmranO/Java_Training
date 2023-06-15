package day27_accessModifiers;

public class TestNestedClassObjects {
    public static void main(String[] args) {

//----Outer class's object can be created as usual----------------------------------------------------------------------

        Car obj1 = new Car();                          //Car object of the outer Class of the nested Class


//----To create the Non-static Inner class's object we need to create the outer class's object first--------------------
                                                       //Then we can create inner class's object through the outer class
                                                       //'s object
        obj1.new CarEngine();                          //CarEngine object of the inner Class of the nested Class

        Car.CarEngine obj2= obj1.new CarEngine();


//----To create the static Inner class's object we don't need to create the outer class's object first------------------

        Car.StaticInnerClass obj3=new Car.StaticInnerClass(); //If the inner Class is static we don't need an outer class's
                                                              // object to create its object

    }
}
