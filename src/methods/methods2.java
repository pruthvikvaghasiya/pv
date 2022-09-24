package methods;

public class methods2 {

    //  methods with static
    public static void m1(){
        String surname="vaghasiya";
        String name="pruthvik";
        System.out.println(surname+" "+name);
    }
    public static int m2(){
         int a=22,b=12;
         int c=a+b;
        return c;
    }
    public static int m3(int a, int b){
       int c=a*b;
       return c;
    }
    public static void main(String[] args) {
        m1();
        System.out.println(m2());
        System.out.println(m3(23,42));

    }
}
