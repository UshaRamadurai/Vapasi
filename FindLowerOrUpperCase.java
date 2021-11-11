//Goal : Code to find the given character is lowercase or uppercase

public class FindLowerOrUpperCase {

    public void findCaseOfCharater(){

        //providing character input
        char character = 'R';

        //providing condition to find if it is a lowercase or not
        if (Character.isLowerCase(character))
            System.out.println("The character is Lowercase");
        else
            System.out.println("The character is Uppercase");
    }

    public static void main(String[] args) {
        FindLowerOrUpperCase obj = new FindLowerOrUpperCase();
        obj.findCaseOfCharater();
    }
}
