package FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void say1() {
                System.out.println("Реализация метода say первая версия");
            }
        };
        myInterface.say1();
        myInterface.say2();
        myInterface.say3();

        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void say1() {
                System.out.println("Реализация метода say вторая версия");
            }
        };
        sayInfo(myInterface);
        sayInfo(myInterface1);
    }
    static void sayInfo (MyInterface myInterfaces){
        myInterfaces.say1();
    }
}