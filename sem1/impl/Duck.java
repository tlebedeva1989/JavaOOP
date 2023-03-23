package impl;

import animals.Animal;
import animals.Flyable;
import animals.Illable;
import animals.Swimable;

public class Duck extends Animal implements Flyable, Illable, Swimable {

    public Duck(String name, String color) {
        super(name, color, 2);
    }

    public Duck(String name) {
        super(name, null, 2);
    }

    @Override
    public void speak() {
        System.out.println("kryA");
    }

    @Override
    public void hunt() {

    }

    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public int getFlightSpeed() {
        return 10;
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getSwimSpeed() {
        return 7;
    }
}