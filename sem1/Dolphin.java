public class Dolphin extends Animal{

    public Dolphin(String name, String color){
        super(name,color,0);

    }

    public Dolphin(String name){
        super(name, null,0);
    }

    @Override
    public void toFly() {
        System.out.println("Dolphins can't fly ");;
    }
    @Override
    public void toGo() {
        System.out.println("Dolphins can't go");
    }

    @Override
    public void speak() {
        System.out.println("Quiiii");
    }
}
