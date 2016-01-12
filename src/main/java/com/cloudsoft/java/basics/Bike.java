package com.cloudsoft.java.basics;

public class Bike implements Vehicle {

    public static final int MAX_GEAR = 6;

    int speed = 0;
    int gear = 1;

    @Override
    public void accelerate(int speedDelta) {
        this.speed += speedDelta * this.gear;
    }

    @Override
    public void brake(int speedDelta) {
        this.speed -= speedDelta;
    }

    /**
     * Changes the internal bike gear.
     *
     * @param gear The gear number to change to.
     */
    public void changeGear(int gear) {
        final int oldGear = this.gear;

        // We change the gear
        this.gear = gear;

        // We also update the speed based on the gear (if changed)
        if (oldGear != this.gear) {
            this.speed = this.speed * this.gear;
        }
    }
}
