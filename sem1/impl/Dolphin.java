package impl;

import animals.Animal;
import animals.Illable;
import animals.Swimable;

public class Dolphin extends Animal implements Illable, Swimable {

    public Dolphin(String name, String color) {
        super(name, color, 0);

    }

    public Dolphin(String name) {
        super(name, null, 0);
    }


    @Override
    public void hunt() {

    }

    @Override
    public void speak() {
        System.out.println("Quiiii");
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getSwimSpeed() {
        return 50;
    }
}
