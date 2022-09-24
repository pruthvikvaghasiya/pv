package basic.homework;
class me{
    void run(){
        System.out.println("i am running");
    }
}

class me2 extends me {
    void run() {
        System.out.println("i am going home");
    }
}
    public class Overriding2 {
        public static void main(String[] args) {
            me2 obj = new me2();
            obj.run();
        }
    }

