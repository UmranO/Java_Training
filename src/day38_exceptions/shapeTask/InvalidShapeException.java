package day38_exceptions.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException (String message){             //Since I want to display the exception message I want to
        super(message);                                        //create the constructor with String argument
    }

}
