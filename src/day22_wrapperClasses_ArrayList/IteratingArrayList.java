package day22_wrapperClasses_ArrayList;
import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args){

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3, 255);

        System.out.println(numbers); //{100, 200, 300, 255, 400, 500}

        //numbers.add(300, 2000);   Index # for next element is 6. If we try to give an index # other than 6 when we use
        //this form of add() like index 300 it is not possible. We can't get index 300 without filling the other indexes
        //you can not skip the index #s in ArrayList. It will result in index out of bound exception bec we don't have
        //index 300, it will be the same if we try to get an element from index# 300 bec this ArrayList doesn't have
        //that many elements

//-----iterating with for loop regular order--------------------------------------------------------------------------
        System.out.println("---------------------------------------------------");

        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
            }

//-----iterating with for loop reversed order--------------------------------------------------------------------------
        System.out.println("---------------------------------------------------");

        for(int i=numbers.size()-1; i>=0; i--){
            System.out.println(numbers.get(i));
        }

//-----iterating with foreach loop reversed order----------------------------------------------------------------------
        System.out.println("---------------------------------------------------");

        for(Integer each:numbers){               //Why do we have Integer in this foreach loop? -Bec data type of each
            System.out.println(each);            //element in this ArrayList is Integer.
                                                 //If we put int instead of Integer we won't have an error. Each Integer
        }                                        //Wrapper class will be assigned to int variable so there
                                                 //will be an extra process of unboxing.
        }
    }

