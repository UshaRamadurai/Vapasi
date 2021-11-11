//Goal : Code to find the smallest number of the given array of integers

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumber {
    public void smallNumber(){
        
        // Declare an array of elements in ArrayList
        List<Integer> listArr1 = new ArrayList<Integer>(Arrays.asList(3, 45,2, 11,4,1,4, 6, 7,67));

        //sorting the arraylist
        Collections.sort(listArr1);
        System.out.println("The sorted list is :" + listArr1);

        //printing the smallest number
        System.out.println("The smallest number of the array is : " +listArr1.get(0));
        
    }

    public static void main(String[] args) {
        SmallestNumber obj = new SmallestNumber();
        obj.smallNumber();
    }
}
