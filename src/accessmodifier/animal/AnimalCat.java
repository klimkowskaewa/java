package accessmodifier.animal;

public class AnimalCat extends Animal {
    private static int counter;
    private static String type = "cat";

    public AnimalCat() {
        counter++;
    }

    @Override
    public int getInstanceNumber() {
        return counter;
    }

    @Override
    public String getType() {
        return type;
    }

}