package com.cloudsoft.java.basics;

public class Launcher {

    public static void main(String [] args) {
        Bike bike = new Bike();

        bike.accelerate(5);
        bike.brake(1);
        printBikeState(bike);

        bike.changeGear(2);
        bike.accelerate(1);
        printBikeState(bike);

        bike.changeGear(3);
        bike.accelerate(3);
        printBikeState(bike);

        bike.changeGear(7);
        bike.accelerate(2);
        printBikeState(bike);
    }

    private static void printBikeState(Bike bike) {
        System.out.println(String.format("[Bike state] gear: %d - speed: %d", bike.gear, bike.speed));
    }
}