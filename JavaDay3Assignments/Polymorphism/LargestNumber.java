package JavaDay3Assignments.Polymorphism;
//Goal : Code to achieve method overloading by finding larger number

public class LargestNumber {

    public void largestOfNumbers(int number1,int number2){
        if (number1 == number2)
            System.out.println("Both the numbers are equal");
        else if(number1 > number2)
            System.out.println(number1 + " is largest");
        else
            System.out.println(number2 + " is largest");

    }
   public void largestOfNumbers(float number1,int number2){
       if (number1 == (float)number2)
           System.out.println("Both the numbers are equal");
        else if (number1 > (float)number2)
            System.out.println(number1 + " is largest");
        else
            System.out.println(number2 + " is largest");

    }

    public void largestOfNumbers(int number1,int number2,String number3) {

        if(number1 == number2 && number2 == Integer.parseInt(number3))
            System.out.println("All the 3 numbers are same");
       else if (number1 > number2 && number1 > Integer.parseInt(number3))
            System.out.println(number1 + " is largest");
        else if(number2 > Integer.parseInt(number3))
            System.out.println(number2 + " is largest");
        else
            System.out.println(number3 + " is largest");
        }
    public void largestOfNumbers(long number1, int number2, String number3){

        if (number1 == (long)number2 && number1 == Long.parseLong(number3))
            System.out.println("All the 3 numbers are same");
       else if (number1 > (long)number2 && number1 > Long.parseLong(number3))
                System.out.println(number1 + " is largest");
            else if ((long)number2 > Long.parseLong(number3))
                System.out.println(number2 + " is largest");
             else
                System.out.println(number3 + " is largest");
    }

    public static void main(String[] args) {
        LargestNumber result = new LargestNumber();
        result.largestOfNumbers(12,-12);
        result.largestOfNumbers(23f,23);
        result.largestOfNumbers(2341,345,"2482");
        result.largestOfNumbers(3545l,45,"14");

    }
}
