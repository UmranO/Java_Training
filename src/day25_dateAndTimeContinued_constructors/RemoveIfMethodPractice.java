package day25_dateAndTimeContinued_constructors;
import day17_customClass.Dog;

import java.util.Arrays;
import java.util.ArrayList;

public class RemoveIfMethodPractice {
    public static void main(String[] args){

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

 System.out.println("----------------------------------------------------------------------------------");
//Note: DO NOT use any loops in the following tasks
//1.1 Create an ArrayList named smallDogs, and add all the dog objects with the size of small from the dogs Array to
//smallDogs ArrayList

        ArrayList<Dog> smallDogs = new ArrayList<>( Arrays.asList(dogs) );        //All the elements of Array-dogs are
                                                                                  //added to ArrayList-smallDogs
        smallDogs.removeIf(p->!p.size.equalsIgnoreCase("Small"));     //But since we want to keep Small ones
        System.out.println(smallDogs);

//The solution with loop:
        ArrayList<Dog> sDogs=new ArrayList<>();
        for (Dog each : dogs) {
            if (each.size.equalsIgnoreCase("Small")){sDogs.add(each);}
        }
        System.out.println(sDogs);
 System.out.println("----------------------------------------------------------------------------------");

//1.2 Create an ArrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs
        //Array to youngDogs arrayList

        ArrayList <Dog> youngDogs=new ArrayList<>(Arrays.asList(dogs));
        youngDogs.removeIf(p->p.age>4);                   //variable p is representing each Dog object of the ArrayList
        System.out.println(youngDogs);                    //So through this variable we can call age, colr..everything
                                                          //about the Dog

        youngDogs.forEach(p-> System.out.println(p.name));


 //The solution with loop:
        ArrayList<Dog> yDogs=new ArrayList<>();
        for (Dog each : dogs) {
            if(each.age<=4){yDogs.add(each);}
        }
        System.out.println(yDogs);

System.out.println("----------------------------------------------------------------------------------");
// 1.3 Create an ArrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogsArray to
//femaleDogs arrayList

        ArrayList<Dog> femaleDogs=new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p->p.gender=='M');       //In order to keep the female dogs we need to remove the male dogs
        System.out.println(femaleDogs);

System.out.println("----------------------------------------------------------------------------------");

// 1.4 Create an ArrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs Array to
//maleDogs ArrayList

        ArrayList<Dog> maleDogs=new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p->p.gender=='F');       //In order to keep the male dogs we need to remove the female dogs
        System.out.println(maleDogs);


System.out.println("----------------------------------------------------------------------------------");
        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

//Remove all the small dogs from the above Array---Since Array size is fixed we can't remove an element from Array
//We can only convert the Array to ArrayList then remove the small ones and convert that Arraylist to a new Array

        System.out.println(Arrays.toString(dogs2));
        System.out.println("--------------------------------------------------------");

        ArrayList<Dog> list2=new ArrayList<>(Arrays.asList(dogs2));         //Converted Array-dogs2 to ArrayList-list2
        list2.removeIf(p->p.size.equalsIgnoreCase("Small"));    //Removed the small dogs

        dogs2=list2.toArray(new Dog[0]);                //While converting the ArrayList to Array we need to instantiate
                                                        //the size and everything of this Array that we want to get.
                                                        //Since we want to get Dog[] & when we instantiate the size
                                                        //we either give 0 as size or the the size of the ArrayList

      //dogs2 = list.toArray(new Dog[list.size()]);       The other way of giving the size of the new Array

        System.out.println(Arrays.toString(dogs2));
    }
}
/*
1. Given the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array
            to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs
	        array to youngDogs arrayList

	        Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to
	        femaleDogs arrayList

	        Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to
	        maleDogs arrayList

	        Note: DO NOT use any loops
 */