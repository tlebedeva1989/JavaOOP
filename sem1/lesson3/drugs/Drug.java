package lesson3.drugs;

import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    private List<Component> components;
    int index;
    private String name;

    public Drug(List<Component> component, String name) {
        this.components = component;
        this.index = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<Component> iterator() {

        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get((index++));
            }
        };


    }

    @Override
    public int compareTo(Drug o) {
        int power = getDrugPower();
        String name = getName();
        if (power == o.getDrugPower()) {
            return name.compareTo(o.getName());
        }
        if (power < o.getDrugPower()) {
            return -1;
        }
        else return 1;
    }

    public int getDrugPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();

        }
        return power;
    }



    @Override
    public String toString() {
        return String.format("%s, Name: %s {components: %s}%n", this.getClass().getSimpleName(), this.getName(),components,getDrugPower());
    }
}
