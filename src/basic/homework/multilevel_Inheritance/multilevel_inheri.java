package basic.homework.multilevel_Inheritance;

    class x{
        public void sum(){
            int a=10,b=20;
           int c=a+b;
            System.out.println(c);
        }
    }
    class y extends x {
        public void mul(){
            int a=10,b=5;
            int c=a*b;
            System.out.println(c);
        }
    }
    class z extends y{
        public void sub() {
            int a=10,b=5;
            int c = a - b;
            System.out.println(c);
        }
    }
    public class multilevel_inheri {
        public static void main(String[] args) {
            z obj = new z();
            obj.sum();
            obj.mul();
            obj.sub();

        }
}



