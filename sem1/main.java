//Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
//        Создать по два класса наследника Animal, умеющих летать, плавать, бегать.
//        В файле readme.md в репозитории github (или ему подобных) описать какие проблемы в
//        таком проектировании Вы увидели, там же написать возникшие при выполнении дз вопросы
//        (если они есть). P.S. Подумать и сделать так, чтобы классы, не умеющие летать,
//        в итоговом коде летать не должны, не плавающие - не плавать, итд


import java.util.ArrayList;
import java.util.List;

public class main {
    /**
     * Main function
     *
     * @param args
     */
    public static void main(String[] args) {
        Animal animal = new Animal(null, null, 1);
        System.out.println(animal.getName());
        Animal animal1 = new Animal("Gony");
        System.out.println(animal1.getPawsCount());
        System.out.println(animal1.getType());
        Cat cat1 = new Cat("Mursik");
        System.out.println(cat1.getType());

        cat1.goToPlay();
//        animal1.eat();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(new dog("Bobic", "black"));
        animals.add(new duck("quack", "white"));

        animals.forEach(Animal::speak);

        for (Animal a: animals){
            if (a instanceof duck) ((duck) a).speak();
            System.out.println(a);
        }

        cat1.hunt();

        Dolphin dolphin = new Dolphin("Stepa");
        Shark shark = new Shark("Fang");

        shark.toFly();
        shark.toSwim();
    }
}
