package farm;

public class Farm {
    public static void main(String[] args) {

        FarmAnimal[] farmAnimals = new FarmAnimal[5];
        farmAnimals[0] = new FarmAnimal();
        farmAnimals[1] = new FarmPig("Pinky");
        farmAnimals[2] = new FarmPig("Charlotte");
        farmAnimals[3] = new FarmDog("Cooper");
        farmAnimals[4] = new FarmCat("Bella");

        for (FarmAnimal farmAnimal : farmAnimals) {
            farmAnimal.introduce();
        }
    }
}