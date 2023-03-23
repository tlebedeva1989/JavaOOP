package animals;

public abstract class Animal {
    private String name;
    private int PawsCount;
    private String color;

    private static int animalsCount = 0;

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public Animal(String name, String color, int PawsCount) {
        this.color = color;
        this.name = name;
        this.PawsCount = PawsCount;
        animalsCount++;
    }

    public Animal(String name, String color) {
        this(name, color, 0);
    }


    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    public abstract void speak();

    public String getName() {
        return name;
    }

    public Integer getPawsCount() {
        return PawsCount;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPawsCount(Integer pawsCount) {
        PawsCount = pawsCount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void hunt();


    @Override
    public String toString() {
        return String.format("Name: %s, Color %s", this.name, this.color);
    }

    public static int getAnimalsCount(){
        return animalsCount;
    }
}
