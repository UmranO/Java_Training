package day22_wrapperClasses_ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args){

        int[] array = new int[5]; //{0, 0, 0, 0, 0}

        array[0] = 10; //{10, 0, 0, 0, 0}
        array[1] = 20; //{10, 20, 0, 0, 0}
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        //   array[5] = 60;                                 The size is set to 5 so can't assign the 6th element
                                                            //It will result with index out of bound exception
        System.out.println(Arrays.toString(array));

        ArrayList<Integer> list= new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
    }
}
