/* В консоль вводится список слов через пробел.
Необходимо вернуть эти слова в виде списка, который отсортирован лексикографическом порядке.
Во время сортировки нужно вывести изначальный порядок слов.
Это значит надо вывести элементы посредством StreamAPI.
А после выполнения работы сортировки конечный.
При этом задача должна быть выполнена за 1 Stream.
То есть может быть только 1 терминальная операция
 */
package Homework15;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        String input = "Мальков Епифанов Быстров 28 Ергунов Корякин Синев 50 Зейналов Ермаков Арутюнова";
        Stream<String> stream = Arrays.stream(input.split( " " ));
        stream.sorted().forEach((s) -> System.out.println(s));
        //stream.forEach(System.out::println);
    }
}