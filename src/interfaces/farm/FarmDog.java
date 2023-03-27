package interfaces.farm;

public class FarmDog extends FarmAnimal{
    public FarmDog(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "dog " + name;
    }

    @Override
    String makeSound() {
        return "woof woof";
    }
}