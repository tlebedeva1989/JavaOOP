package impl;

import animals.Animal;
import animals.Flyable;
import animals.Illable;

public class Eagle extends Animal implements Flyable, Illable {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 100;
    }

    @Override
    public void getIll() {

    }
}
