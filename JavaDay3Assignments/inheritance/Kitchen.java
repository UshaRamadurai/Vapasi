package JavaDay3Assignments.inheritance;

public class Kitchen extends Home{

    @Override
    public void noOfLights() {
        room="Kitchen";
        lightsNumber=1;
        System.out.println("The number of lights in " + room + " is " + lightsNumber);
    }

}
