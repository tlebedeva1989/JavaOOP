package impl;

import animals.Animal;
import animals.Illable;
import animals.Runable;
import animals.Swimable;

public class Human implements Illable, Swimable, Runable {
    private String name;

    public Human(String name){
        this.name = name;
    }
    public Human(){this(null);}


    @Override
    public void getIll() {

    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }


    @Override
    public int getRunSpeed() {
        return 20;
    }
}
