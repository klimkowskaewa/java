public class LogicCheck {
    public static void main(String[] args) {
        int x;
        x = 35;
        boolean test;

        if ((x%7) == 0 && (x%5) == 0)
        {test = true;}
        else
        {test = false;}

        System.out.println("Is the number" + x + " divided by  5 and 7 at the same time? ");
        System.out.println(test);

    }
}