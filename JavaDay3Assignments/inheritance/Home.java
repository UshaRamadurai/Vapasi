package JavaDay3Assignments.inheritance;
//Goal: Code to achieve Inheritance and Method overriding
//Home--->Kitchen
//Home--->bedroom
//Home--->Livingroom
//Home--->bathroom

public class Home {
    public int lightsNumber;
    public String room;
    public void noOfLights()
    {
        room = "Home";
        lightsNumber=7;
        System.out.println("The number of lights in " + room + " is " + lightsNumber);
    }
}
