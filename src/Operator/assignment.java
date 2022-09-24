package Operator;

public class assignment {
    public static void equal() {
        int a = 123;
        int b = 456;            // Assignment operator
        int c= a=b;
        System.out.println(a);
    }
    public static void assign(){
        int x= 10,y=20,z=15,a=50,b=30;
        x+=5;
        System.out.println(x);
        y-=10;
        System.out.println(y);
        z*=3;
        System.out.println(z);
        a/=5;
        System.out.println(a);
        b%=7;
        System.out.println(b);
    }

    public static void main(String[] args) {
        equal();
        assign();
    }
}
