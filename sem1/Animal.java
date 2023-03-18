

public class Animal {
    private String name;
    private int PawsCount;
    private String color;

    public String getType(){
        return this.getClass().getSimpleName();
    }
    public Animal(String name, String color, int PawsCount){
        this.color = color;
        this.name = name;
        this.PawsCount = PawsCount;
    }

    public Animal(String name,String color){this(name,color,0);}



    public Animal(String name){
        this(name,null,0);
    }

    public void speak(){
        System.out.println("Yarr");
    }

    public void toFly(){
        System.out.println("I'm flying");
    }

    public void toSwim(){
        System.out.println("Swimming bul bul");
    }

    public void toGo(){
        System.out.println("I'm going top top");
    }
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

    @Override
    public String toString() {
        return String.format("Name: %s, Color %s", this.name, this.color );
    }
}
