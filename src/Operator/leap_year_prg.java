package Operator;
import java.util.Scanner;

public class leap_year_prg {
    public static void leapOrNot(){
        int year;
        Scanner x = new Scanner(System.in);
        year=x.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year + " is a leap year");
        } else
            System.out.println(year + " is not a leap year");
    }
    public static void main(String[] args) {
        leapOrNot();
    }
}
