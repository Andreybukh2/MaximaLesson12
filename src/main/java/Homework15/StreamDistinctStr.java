package Homework15;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamDistinctStr {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Бобков", "Зейналов", "Арутюнов", "Бобков");
        List<String> stringList = stringStream.distinct()
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}