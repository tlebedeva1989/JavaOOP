public class dog extends Animal {
    public dog(String name, String color) {
        super(name, color,4 );
    }

    @Override
    public void speak() {
        System.out.println("affff");
    }

    @Override
    public void toFly() {
        System.out.println("Dogs can't fly");
    }
}
