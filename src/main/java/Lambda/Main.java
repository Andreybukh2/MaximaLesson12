package Lambda;

public class Main {
    public static void main(String[] args) {
        MyInterface<Number> myInterface1 = () -> System.out.println("Реализация №1 на шаблоне метода void methodBase();");
        MyInterface<Number> myInterface2 = () -> System.out.println("Реализация №2 на шаблоне метода void methodBase();");

        myInterface1.methodBase();
        myInterface2.methodBase();
        System.out.println();
        myInterface1.methodDefault1();
        myInterface1.methodDefault2();
        myInterface1.methodDefault3();
    }
}
