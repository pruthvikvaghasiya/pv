package basic.homework;

class ab{
    public void eat()
    {
        System.out.println("i am eating");
    }
}
class i extends ab {
    public void eat() {
        System.out.println("i am eating");
    }
}
public class Overriding {
    public static void main(String[] args) {
        i obj = new i();

        obj.eat();

    }
}

