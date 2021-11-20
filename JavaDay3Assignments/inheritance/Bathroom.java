package JavaDay3Assignments.inheritance;

public class Bathroom extends Home{

    @Override
    public void noOfLights() {
        room="Bath Room";
        lightsNumber=1;
        System.out.println("The number of lights in " + room + " is " + lightsNumber);
    }


}
