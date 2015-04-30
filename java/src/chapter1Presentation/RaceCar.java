package chapter1Presentation;

/**
 * Created by nsmirosh on 4/19/2015.
 */
public class RaceCar extends Vehicle {

    public RaceCar() {
        passengerBehavior = new NotAbleToPickUp();
        nitroBehavior = new RaceCarNitro();
    }


    public void pickUpPassengers() {
        //pick up passenger in a special way
    }
}
