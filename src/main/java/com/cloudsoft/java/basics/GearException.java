package com.cloudsoft.java.basics;

public class GearException extends IllegalArgumentException {

    private final int gear;

    public GearException(int gear) {
        super();
        this.gear = gear;
    }

    public int getBrokenGear() {
        return this.gear;
    }

    @Override
    public String getMessage() {
        return String.format("The gear number %s is broken!", this.gear);
    }
}
