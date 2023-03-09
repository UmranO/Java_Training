package day14_forLoop;

public class OverloadingTheMainMethod {

    public static void main(String[] args) {
        System.out.println("A");                                    //If we call the fake main()s in the real main()
        main(25); // B                                         //depending on the arguments we pass corresponding
        main(2.05); //C                                        //fake main() will be executed.But if not called in
        main(true); //D                                        //real main() then only real main () will be executed and
                                                                    //A will be printed in the console.

    }
//--Yukarisi main()'lu-------------------------------------------------------------------------------------------------

    public static void main(int args){
        System.out.println("B");
    }

    public static void main(double args){
        System.out.println("C");
    }

    public static void main(boolean args){
        System.out.println("D");
    }

}
