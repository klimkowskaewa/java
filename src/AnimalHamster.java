public class AnimalHamster extends Animal{
    private static int counter;
    private static String type = "hamster";

    public AnimalHamster() {
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