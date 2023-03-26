package farm;

public class FarmPig extends FarmAnimal{
    public FarmPig(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "pig " + name;
    }

    @Override
    String makeSound() {
        return "oink oink";
    }
}