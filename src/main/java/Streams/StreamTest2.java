package Streams;

import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        Stream.of("Элемент потока 1", "Элемент потока 2","Элемент потока 3","Элемент потока 4")
                .     filter((s) -> {
                    System.out.println("Use filter - " + s);
                    return true;
                })
                .peek((s) -> System.out.println("Use peek - " + s))
                .forEach((s) -> System.out.println("Use forEach - " + s));
    }
}