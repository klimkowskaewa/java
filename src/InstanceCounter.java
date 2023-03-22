public class InstanceCounter {
    private static int numInstances = 0;

    public static int getNumInstances() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    public InstanceCounter() {
        addInstance();
    }

    public static void main(String[] args) {
        System.out.println("The number of instances at the beginning: " + InstanceCounter.getNumInstances());
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                new InstanceCounter();
            }
        }
        System.out.println("Created: " + InstanceCounter.getNumInstances());
    }
}