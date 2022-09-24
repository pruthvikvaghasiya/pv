package methods;

public class method1 {

    // methods with Non-Static
    public void m1(){
        int a= 10;
        ++a;
        System.out.println(a);
    }
    public String m2(){
        String MyBirthCountry = "india";
        String myBirthCity="Surat";
        String c= "my birth place = "+MyBirthCountry+ "\n"+"my birth city = "+myBirthCity;
        return  c;
    }
    public int m3(int a,int b){
        int x=a-b;
        return x;
    }

    public static void main(String[] args) {
        method1 obj1 = new method1();
        obj1.m1();
        System.out.println(obj1.m2());
        System.out.println(obj1.m3(500,450));
    }
}
