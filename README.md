Java Basics - Exercises
===

By running this program, here is what you should see in a console:

````
[Bike state] gear: 1 - speed: 4
[Bike state] gear: 2 - speed: 10
[Bike state] gear: 3 - speed: 39
[Bike state] gear: 7 - speed: 287
```

Exercise 1
====

Create a Bicycle interface that extends from Vehicle and contains the `Bike#changeGear(int gear)` method.
Make the Bike class implement this new interface and run this program again. The output should remain unchanged.

Exercise 2
====

Make the gear and speed initialisation through a Bike constructor.

Exercise 3
====

Use the if-then-else statement to ensure that the gear is always between 1 and `Bike#MAX_GEAR`.
All invalid values will just be discarded for now. Run this program again, the last gear change shouldn't happen,
the output should look like this:

```
[Bike state] gear: 1 - speed: 4
[Bike state] gear: 2 - speed: 10
[Bike state] gear: 3 - speed: 39
[Bike state] gear: 3 - speed: 45
```

Exercise 4
====

Create 2 subclasses of `Bike`: `TandemBike` and `MountainBike`.
`TandemBike` will implement the `Horn` interface by making the sound: `2 seater!`.
`MountainBike` will override the `Bike#brake(int speedDelta)` method as it can brake 2 times harder.

Exercise 5
====

Replace in the main method the: `Bike bike = new Bike();` by `BrokenBike bike = new BrokenBike();`. The program
will outpout only this then stop because an exception is thrown

```
[Bike state] gear: 1 - speed: 4
[Bike state] gear: 2 - speed: 10
Exception in thread "main" com.cloudsoft.java.basics.GearException: The gear number 3 is broken!
....
```

Catch this exception, display the error message to the console, change to a closest lower gear then do one brake of "2".
The output should now look like that:

```
[Bike state] gear: 1 - speed: 4
[Bike state] gear: 2 - speed: 10
The gear number 3 is broken!
[Bike state] gear: 2 - speed: 8
```