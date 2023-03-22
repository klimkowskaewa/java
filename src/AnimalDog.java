public class AnimalDog extends Animal{
    private static int counter;
    private static String type = "dog";

    public AnimalDog() {
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