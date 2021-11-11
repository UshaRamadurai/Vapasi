//Goal : Code to get the day of the inputted date in a month

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class ConditionalStatement {

public void calendar(){

    //Initialising scanner class to get the input
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any date between 1-31");

    //storing input in integer variable
    int date = sc.nextInt();

    //setting condition for input not exceeding 31
    if (date < 32) {
        switch (date % 7) {
            case 0:
                System.out.println("It is Sunday");
                break;
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
        }
    }
    //when wrong input provided with data greater than 31
    else
        System.out.println("Provide date with range 1-31");

}
    public static void main(String[] args) {

        ConditionalStatement obj = new ConditionalStatement();
        obj.calendar();

    }
}


