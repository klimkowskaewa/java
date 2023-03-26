package farm;

public class FarmAnimal {
    String name;

    public FarmAnimal() {
        this.name = "no name";
    }

    String showName() {
        return "animal " + name;
    }

    String makeSound() {
        return "???";
    }

    void introduce() {
        System.out.println("I am " + showName() + ": " + makeSound());
    }
}