package day39_collections.multiThreading;

public class TestMultiThreads {
    public static void main(String[] args){

        ThreadHelloWorld t1 = new ThreadHelloWorld(1);
        ThreadHelloWorld t2 = new ThreadHelloWorld(2);
        ThreadHelloWorld t3 = new ThreadHelloWorld(3);
        ThreadHelloWorld t4 = new ThreadHelloWorld(4);
        ThreadHelloWorld t5 = new ThreadHelloWorld(5);

       /*
        t1.run();       If instead of start(0 if we call run() all the threads won't be executed at the same time,
        t2.run();       instead 1st thread will be completed then the 2nd , 3rd....But if we call start() all the
        t3.run();       threads will be executed at the same time. satart() is Thread Class's method and Runnable is a
        t4.run();       functional interface with run(). So if we implement Runnable and create a thread then we have to
        t5.run();       create a Thread object and give an instance of the custom thread class which implements Runnable
                        to start() we called from the Thread object as an arguement.
 */
        

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
