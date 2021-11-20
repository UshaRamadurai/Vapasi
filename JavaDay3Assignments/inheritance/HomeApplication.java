package JavaDay3Assignments.inheritance;

public class HomeApplication {

    public static void main(String[] args) {
        Home home = new Home();
        home.noOfLights();
        Home livingRoom= new LivingRoom();
        livingRoom.noOfLights();
        Kitchen kitchen = new Kitchen();
        kitchen.noOfLights();
        Bedroom bedroom = new Bedroom();
        bedroom.noOfLights();
        Bathroom bathroom = new Bathroom();
        bathroom.noOfLights();
    }
}
