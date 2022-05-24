public class Cat extends Animal implements AnimalNoiseCapable{
        
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {
        System.out.println(super.getName() + " purrs.");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
