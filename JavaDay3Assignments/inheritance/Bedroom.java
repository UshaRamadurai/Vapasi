package JavaDay3Assignments.inheritance;

public class Bedroom extends Home{

    @Override
    public void noOfLights() {
        room="Bed Room";
        lightsNumber=2;
        System.out.println("The number of lights in " + room + " is " + lightsNumber);
    }

}
