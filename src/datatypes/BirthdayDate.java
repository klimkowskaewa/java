package datatypes;

import java.util.StringTokenizer;

public class BirthdayDate {
    public static void main(String[] args) {

        StringTokenizer str1;

        String birthday1 = "29/04/2016";
        str1 = new StringTokenizer(birthday1, "/");
        System.out.println(birthday1);
        System.out.println();
        System.out.println("Day: " + str1.nextToken());
        System.out.println("Month: " + str1.nextToken());
        System.out.println("Year: " + str1.nextToken());
        System.out.println();

        //OTHER SOLUTION

        String birthday = "29/04/2016";
        String day = birthday.substring(0,2);
        String month = birthday.substring(3,5);
        String year = birthday.substring(6,10);

        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

    }
}