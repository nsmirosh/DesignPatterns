package chapter1Presentation;

/**
 * Created by nsmirosh on 4/24/2015.
 */
public class CarTester {

    public static void main(String[] args) {

        Vehicle vehicle1 = new RaceCar();
        vehicle1.setNitroBehavior(new RaceCarNitro());
        vehicle1.setPassengerBehavior(new PickUpEverybody());
    }

}
