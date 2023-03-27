package accessmodifier.animal;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {

    Animal[] animals = new Animal[100];
    Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
        int r = random.nextInt(3);
        switch (r){
            case 0:
                animals[i] = new AnimalDog();
                break;
            case 1:
                animals[i] = new AnimalCat();
                break;
            case 2:
                animals[i] = new AnimalHamster();
                break;
        }
    }
        System.out.println("All animals:");
        for (Animal animal: animals) {
        System.out.println(animal.getType());
    }
        System.out.print("Object 33: ");
        System.out.print(animals[32].getType() + " ");
        System.out.print(animals[32].getInstanceNumber());
    }
}