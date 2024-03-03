package utilities;

public class Library {

    public static void sleep(double seconds)  {         //Since this custom() that we created is a utility() which will
                                                        //be frequently called by other parts of the program it is wiser
                                                        //to handle it with try catch blocks which gets rid of the error
                                                        //permanently instead of ignoring with throws keyword since the
                                                        // caller of the method still needs to handle the error.
        try {
            Thread.sleep( (long)(seconds * 1000L) );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}