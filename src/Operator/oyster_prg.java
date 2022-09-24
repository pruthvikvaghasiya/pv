package Operator;
import java.util.Scanner;

public class oyster_prg {
    public static void oyster(){
        int a;
        System.out.println("enter amount : ");
        Scanner x = new Scanner(System.in);
        a=x.nextInt();
        if(a>=10){
            System.out.println("enjoy your journey");
        }else {
            System.out.println("sorry, please Top-up and continue your journey");
        }
    }
    public static void main(String[] args) {
        oyster();
    }
}
