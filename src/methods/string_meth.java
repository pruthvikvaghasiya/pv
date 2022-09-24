package methods;

public class string_meth {
    public static void stringFun(){
        String a="pruthvik";
        String b="vaghasiya";
        System.out.println(a.length());
        System.out.println(a.concat(b));
        System.out.println(a.replaceAll(a,b));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

    }

    public static void main(String[] args) {
        stringFun();
    }
}
