package JavaDay3Assignments.Polymorphism;
//Goal : Code to achieve Polymorphism and method overriding with "+" operator

class Add {
    public void mtdOverride(String input1, String input2) {
        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);
        System.out.println("The output is :" + (number1 + number2));
    }
}

public class MethodOverriding extends Add {
    @Override
    public void mtdOverride(String input1, String input2) {
        System.out.println( "The output is :" + input1 + input2);
    }

    public static void main(String[] args) {

        MethodOverriding concat = new MethodOverriding();
        concat.mtdOverride("Java","Programming");

        Add add = new Add();
        add.mtdOverride("23","56");

    }

}