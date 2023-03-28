package Homework15;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamDistinctInt {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(43, 65, 1, 98, 63, 63, 1);
        List<Integer> integerList = integerStream.distinct()
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}