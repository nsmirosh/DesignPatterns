package chapter1Presentation;

/**
 * Created by nsmirosh on 4/18/2015.
 */
public abstract class Vehicle {

    PassengerBehavior passengerBehavior;
    NitroBehavior nitroBehavior;

    public void ride() {
        //ride implementation code
    }

    public void performPickUpPassengers() {
        passengerBehavior.pickUpPassengers();

    }

    public void performUseNitro() {
        nitroBehavior.useNitro();
    }


    public void setPassengerBehavior(PassengerBehavior pb) {
        passengerBehavior = pb;
    }

    public void setNitroBehavior(NitroBehavior nb) {
        nitroBehavior = nb;
    }

    Vehicle modelCar = new ModelCar();
    modelCar.performUseNitro();
    modelCar.setNitroBehavior(new RocketPoweredNitro());
    modelCar.performUseNitro();

}
