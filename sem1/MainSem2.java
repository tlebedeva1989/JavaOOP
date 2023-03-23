import animals.*;
import impl.*;
import veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class MainSem2 {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Barsik"))
                .addAnimal(new Dog("bobik"))
                .addAnimal(new Duck("Donald"))
                .addAnimal(new Dolphin("Flipper"))
                .addAnimal(new Eagle("Orel"))
                .addAnimal(new Shark("Clack"));

        List<Illable> illables = new ArrayList<>();
        illables.add(new Cat("Barsik"));
        illables.add(new Human("Vasya"));

        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Eagle("Eagle"));
        flyables.add(new Duck("Donalduck"));

        for (Flyable f :
                flyables) {
            System.out.println(f.getFlightSpeed());

        }

        System.out.println("Все животные клиники: " + vetClinic.getAnimals());
        System.out.println("Животные, которые умеют летать: " + vetClinic.getFlyingAnimals());
        System.out.println(" Животные, которые умеют бегать" + vetClinic.getRunningAnimals());
        System.out.println("Животные, которые умеют плавать:" + vetClinic.getSwimmingAnimals());




    }
}
