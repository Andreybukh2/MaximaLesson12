package Consumers;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = (v) -> System.out.println("Реализация Consumer<String> " + v);
        MyInterface<Integer> myInterface = (s) -> System.out.println("Реализация MyInterface<Integer> " + s);
        MyInterface<String> myInterface1 = (s) -> System.out.println("Реализация MyInterface<String> " + s);

        consumer.accept("и далее у consumer вызван метод accept ");
        System.out.println();

        myInterface.methodBase(125);
        myInterface1.methodBase("Andrey");
        System.out.println();

        MethodConsumer((s) -> System.out.println(s), "И далее реализовать дополнительную логику №1");
        System.out.println();
        MethodConsumer((s) -> System.out.println(s), "И далее реализовать дополнительную логику №2");
    }
    public static void MethodConsumer (Consumer<String> consumer, String value){
        System.out.println("В этом методе можно реализовать какую то общую логику");
        consumer.accept(value);
    }
}
