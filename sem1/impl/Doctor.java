package impl;

import animals.Animal;

public class Doctor extends Human{

    public Doctor(String name){super(name);}

    public void treat(Animal animal){
        System.out.println("Doctor treat " + animal);
    }
}
