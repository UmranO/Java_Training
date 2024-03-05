package day38_exceptions;

class CustomCheckedException extends Exception{

}

class CustomUncheckedException extends RuntimeException{

}


public class CustomExceptions {                          //There can be only 1 public class in a Java file and that
    public static void main (String [] args){            //class name should be same as the Java file.The other classes
                                                         //(above) can't be public but we can have as many as we want

        try {
            throw new CustomCheckedException();        //Since it's a checked exception it has to be handled immediately
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }

    }
}
