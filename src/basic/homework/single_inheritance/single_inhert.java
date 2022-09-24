package basic.homework.single_inheritance;

class a{
    public void name(){
        System.out.println("pruthvik");
    }
}
class b extends a{
    public void surname(){
        System.out.println("vaghasiya");
    }
}
public class single_inhert {
    public static void main(String[] args) {
        b x= new b();
        x.name();
        x.surname();

    }
}
