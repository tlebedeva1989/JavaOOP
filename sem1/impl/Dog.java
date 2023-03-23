package impl;

import animals.Animal;
import animals.Illable;
import animals.Runable;
import animals.Swimable;

public class Dog extends Animal implements Illable, Swimable, Runable {
    public Dog(String name, String color) {
        super(name, color, 4);
    }

    public Dog(String name) {
        super(name, null, 4);
    }

    @Override
    public void speak() {
        System.out.println("affff");
    }

    @Override
    public void hunt() {

    }

    @Override
    public void getIll() {

    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }


    @Override
    public int getRunSpeed() {
        return 20;
    }
}
