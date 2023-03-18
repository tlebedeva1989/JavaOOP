public class Shark extends Animal {

    public Shark(String name,String color){
        super(name, color);
    }

    public Shark(String name){
        super(name);
    }

    @Override
    public void toFly() {
        System.out.println("Sharks can't fly ");;
    }

    @Override
    public void toGo() {
        System.out.println("Sharks can't go");
    }

    @Override
    public void speak() {
        System.out.println("Clack-Clack");
    }
}
