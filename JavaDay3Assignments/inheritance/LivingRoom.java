package JavaDay3Assignments.inheritance;

public class LivingRoom extends Home{

    @Override
    public void noOfLights() {
        room="Living Room";
        lightsNumber=3;
        System.out.println("The number of lights in " + room + " is " + lightsNumber);
    }

}
