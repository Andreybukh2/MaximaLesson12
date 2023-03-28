package Streams;

import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        Stream.of("гараж", "ворота", "яхта", "автомобиль", "корова")
                .filter((s) -> {System.out.println("Use filter - " + s);
                    return s.contains("оро");
                })
                .peek((s) -> System.out.println("Use peek - " + s))
                .forEach((s) -> System.out.println("Use forEach " + s));
    }
}
