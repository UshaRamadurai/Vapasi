//Goal: Code to extract digits from a number and display it ascending order
//Eg: I/p-38920
//o/p- 02389
package JavaDay2Assignments;

import java.util.*;

public class OrderDigits {
    public void orderingDigitsAscending() {

        //Getting input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();
        List<Integer> arrayList = new ArrayList<>();

        //Extracting the digits
        System.out.println("The Digits of number is:");
        while (number > 0) {
            int digit = number % 10;
            System.out.print(" " + digit);
            number = number / 10;
            arrayList.add(digit);   //storing the digits in Array list
        }

        //Sorting and printing the array
        Collections.sort(arrayList);
        System.out.println();
        System.out.println("The sorted order of digits : ");
        for (int i:arrayList) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        OrderDigits obj = new OrderDigits();
        obj.orderingDigitsAscending();
    }
}
