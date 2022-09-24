package basic.homework;
class Calculate {
    void sum(int a, int b) {
        System.out.println("sum is" + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("sum is" + (a + b + c));
    }
}
public class Overloading2 {
    public static void main(String[] args) {
        Calculate  cal = new Calculate();
        cal.sum (10,5);
        cal.sum (10,20,30);
    }

}
