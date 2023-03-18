public class duck extends Animal {

    public duck(String name, String color) {
        super(name, color, 2);
    }

    @Override
    public void speak(){
        System.out.println("kryA");
    }


}