package day34_abstraction.animalTask;

public interface WildAnimal {

    boolean isWild=true;                                    //Variables in an abstract class can only be static & final

    void hunt();                                            //by default access modifier is  public & the () is abstract
                                                            //the body of the () will be given in the sub classes that
                                                            //choose to implement this interface.
}
