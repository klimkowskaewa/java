package loops.car;

import java.util.Random;

public class CarParking {
    public static void main(String[] args) {
        String[] models = {"Yaris", "Corolla", "Aygo" };
        String[] colors = {"silver", "blue", "black" };
        int[] years = {2018, 2019, 2020};

        Random random = new Random();

        Car[] motomachi = new Car[5000];
        Car[] tsutsumi = new Car[4500];
        Car[] tahara = new Car[1700];

        for (int i = 0; i < motomachi.length; i++) {
            int m = random.nextInt(3);
            int c = random.nextInt(3);
            int y = random.nextInt(3);
            motomachi[i] = new Car(models[m], colors[c], years[y]);
        }

        int counter = 0;
        for (int i = 0; i < motomachi.length; i++) {
            if ((motomachi[i].getModel().equals("Yaris")) && (motomachi[i].getColor().equals("silver")) && (motomachi[i].getYear() == 2020)) {
                counter++;
            }
        }
        System.out.println("How many silver 2020 Toyota Yaris cars are in the parking lot of the Motomachi factory? " + counter);
        System.out.println();



        for (int i = 0; i < tsutsumi.length; i++) {
            int m = random.nextInt(3);
            int c = random.nextInt(3);
            int y = random.nextInt(3);

            tsutsumi[i] = new Car(models[m], colors[c], years[y]);
        }

        int silverCounter = 0;
        int blueCounter = 0;
        int blackCounter = 0;
        for (int i = 0; i < tsutsumi.length; i++) {
            switch (tsutsumi[i].getColor()) {
                case "sliver" :
                    silverCounter++;
                case "blue" :
                    blueCounter++;
                case "black" :
                    blackCounter++;
            }
        }
        System.out.print("What's the most popular color of cars in the Tsutsumi factory parking lot? ");
        if (silverCounter < blueCounter) {
            System.out.println("Blue: " + blueCounter);
        } else if (blueCounter< blackCounter) {
            System.out.println("Black: " + blackCounter);
        } else {
            System.out.println("Silver: " + silverCounter);
        }
        System.out.println();



        for (int i = 0; i < tahara.length; i++) {
            int m = random.nextInt(3);
            int c = random.nextInt(3);
            int y = random.nextInt(3);
            tahara[i] = new Car(models[m], colors[c], years[y]);
        }

        System.out.println("Display information about the first 10 cars in the Tahara factory parking lot:");
        for (int i = 0; i < 10; i++) {
            System.out.println(tahara[i].toString());
        }
    }
}