package com.cloudsoft.java.basics;

public class BrokenBike extends Bike {

    @Override
    public void changeGear(int gear) throws GearException {
        if (gear == 3) {
            throw new GearException(3);
        }
        super.changeGear(gear);
    }
}
