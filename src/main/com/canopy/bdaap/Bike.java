package main.com.canopy.bdaap;

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
        this.speed -= speedDelta * this.gear;
    }

    public void changeGear(int gear) {
        // We change the gear
        this.gear = gear;

        // We also update the speed based on the gear
        this.speed = this.speed * this.gear;
    }
}
