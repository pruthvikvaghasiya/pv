package basic.homework;

class a{
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(char c, int num)
    {
        System.out.println(c + " "+num);
    }
}
public class Overloading {
    public static void main(String[] args) {
        a obj = new a();
        obj.disp('a');
        obj.disp('a',10);
    }
}
