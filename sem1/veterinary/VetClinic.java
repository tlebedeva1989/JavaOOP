package veterinary;

import animals.Animal;
import animals.Flyable;
import animals.Runable;
import animals.Swimable;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;

    public List<Animal> getAnimals() {
        return animals;
    }

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;

    }

    public VetClinic() {
        this.animals = new ArrayList<>();
    }

    public List<Runable> getRunningAnimals() {
        List<Runable> runningAnimals = new ArrayList<>();

        for (Animal a : this.animals)
            if (a instanceof Runable) runningAnimals.add((Runable) a);

        return runningAnimals;
    }

    public List<Swimable> getSwimmingAnimals() {
        List<Swimable> swimmingAnimals = new ArrayList<>();
        for (Animal a :
                this.animals) {
            if (a instanceof Swimable) swimmingAnimals.add((Swimable) a);

        }
        return swimmingAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();
        for (Animal a :
                this.animals)
            if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

        return flyingAnimals;
    }
}
