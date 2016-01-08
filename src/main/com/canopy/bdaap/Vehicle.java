package main.com.canopy.bdaap;

public interface Vehicle {

    /**
     * Accelerate the speed of the vehicle.
     *
     * @param speedDelta The speed to add to the current speed.
     */
    void accelerate(int speedDelta);

    /**
     * Decrease the speed of the vehicle.
     *
     * @param speedDelta The speed to remove from the current speed.
     */
    void brake(int speedDelta);
}
