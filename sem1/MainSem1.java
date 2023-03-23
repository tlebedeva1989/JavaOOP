//Добавить в класс animals.Animal методы двигаться(toGo), летать(fly), плавать(swim).
//        Создать по два класса наследника animals.Animal, умеющих летать, плавать, бегать.
//        В файле readme.md в репозитории github (или ему подобных) описать какие проблемы в
//        таком проектировании Вы увидели, там же написать возникшие при выполнении дз вопросы
//        (если они есть). P.S. Подумать и сделать так, чтобы классы, не умеющие летать,
//        в итоговом коде летать не должны, не плавающие - не плавать, итд


import animals.*;
import impl.*;

import java.util.ArrayList;
import java.util.List;

public class MainSem1 {
    /**
     * Main function
     *
     * @param args
     */
    public static void main(String[] args) {
//       animals.Animal animal = new animals.Animal(null, null, 1);
//        System.out.println(animal.getName());
//        animals.Animal animal1 = new animals.Animal("Gony");
//        System.out.println(animal1.getPawsCount());
//        System.out.println(animal1.getType());
        Cat cat1 = new Cat("Mursik");
        System.out.println(cat1.getType());

        cat1.goToPlay();
//        animal1.eat();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(new Dog("Bobic", "black"));
        animals.add(new Duck("quack", "white"));

        animals.forEach(Animal::speak);

        for (Animal a: animals){
            if (a instanceof Duck) ((Duck) a).speak();
            System.out.println(a);
        }

        cat1.hunt();

        Dolphin dolphin = new Dolphin("Stepa");
        Shark shark = new Shark("Fang");



    }
}
