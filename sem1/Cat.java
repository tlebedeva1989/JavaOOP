public class Cat extends Animal {
    public Cat(String name, String color){
        super(name,color,4);
    }

    public Cat(String name){
        super(name);
    }
    private void wakeUp(){
        System.out.println("Cat Woke up..");
    }

    private void findFood() {
        System.out.println("Cat found food ");
    }

    private void eat(){
        System.out.println("Cat ate ");
    }

    public void goToPlay(){
        System.out.println("CAt played ");
    }

    @Override
    public void toFly() {
        System.out.println("Cats can't fly meow!");
    }

    @Override
    public void toSwim() {
        System.out.println("Cats don't like water brrrrrr");
    }

    public void goToSleep(){
        System.out.println("Already asleep ");
    }

    public void hunt(){
        wakeUp();
        findFood();
        eat();
    }
    @Override
    public void speak() {
        System.out.println("meow");
    }
}
