package impl;

import animals.Animal;
import animals.Illable;
import animals.Runable;

import java.io.Serializable;

public class Cat extends Animal implements Illable, Runable {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        super(name);
    }

    public void goToPlay() {
        System.out.println("Cat played ");
    }


    public void goToSleep() {
        System.out.println("Already asleep ");
    }


    @Override
    public void speak() {
        System.out.println("meow");
    }


    protected void wakeUp() {
        System.out.println("impl.Cat Woke up..");
    }

    protected void findFood() {
        System.out.println("impl.Cat found food ");
    }

    protected void eat() {
        System.out.println("impl.Cat ate ");
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }



    @Override
    public void getIll() {
        System.out.printf("%s заболел", this.getName());
    }




    @Override
    public int getRunSpeed() {
        return 15;
    }
}



