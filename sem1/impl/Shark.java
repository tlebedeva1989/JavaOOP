package impl;

import animals.Animal;
import animals.Illable;
import animals.Swimable;

public class Shark extends Animal implements Illable, Swimable {

    public Shark(String name, String color) {
        super(name, color);
    }

    public Shark(String name) {
        super(name);
    }

    @Override
    public void hunt() {

    }

    @Override
    public void speak() {
        System.out.println("Clack-Clack");
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getSwimSpeed() {
        return 50;
    }
}
