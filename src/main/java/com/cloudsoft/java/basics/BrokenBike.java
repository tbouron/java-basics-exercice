package com.cloudsoft.java.basics;

public class BrokenBike extends Bike {

    @Override
    public void changeGear(int gear) {
        if (gear == 3) {
            throw new IllegalArgumentException("The gear number 3 is broken!");
        }
        super.changeGear(gear);
    }
}
