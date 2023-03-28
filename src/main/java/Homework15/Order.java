/*
1. LocalDateTime - ввели поток из даты и времени;
2. Создали условия при которых даты сравниваются;
3. Для практики ввел две разных реализации вывода в консоль
 */
package Homework15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    long id;
    String name;
    List<Item> itemList;
    public static void main(String[] args) {
        LocalDateTime createDate1 = LocalDateTime.of(2023, 3, 3, 20, 50, 45);
        LocalDateTime createDate2 = LocalDateTime.of(2023, 3, 3, 20, 50, 40);
        if (createDate1.equals(createDate2)) {
            System.out.println("Одинаковые даты");
        } else if (createDate1.compareTo(createDate2) > 0) {
            System.out.println(String.format(createDate1 + " эта дата находится позже чем " + createDate2));
        } else if (createDate1.compareTo(createDate2) < 0) {
            System.out.println(String.format("%s эта дата находится ранее чем %s", createDate1, createDate2));
        }
    }
}