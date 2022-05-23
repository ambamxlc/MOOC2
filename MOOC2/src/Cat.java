public class Cat extends Animal implements NoiseCapable {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("the cat");
    }

    public void purr() {
        System.out.println(this.getName() + "purrrrrrrr");
    }

    @Override
    public void makesNoises() {
        this.purr();
    }
}