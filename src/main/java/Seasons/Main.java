package Seasons;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Months> monthsLink = getFromBase();

        List<Months> showResult = new ArrayList<>();
        for (Months monthsFor : monthsLink){
            if (monthsFor.getSeasons().equals(Seasons.AUTUMN)){
                showResult.add(monthsFor);
            }
        }
        showResult.forEach(System.out::println);
    }
    private static List<Months> getFromBase(){
        return List.of(
                new Months("Январь", 1, Seasons.WINTER),
                new Months("Февраль", 2,Seasons.WINTER),
                new Months("Март", 3, Seasons.SPRING),
                new Months("Апрель", 4, Seasons.SPRING),
                new Months("Май", 5, Seasons.SPRING),
                new Months("Июнь", 6, Seasons.SUMMER),
                new Months("Июль", 7, Seasons.SUMMER),
                new Months("Август", 8, Seasons.SUMMER),
                new Months("Сентябрь", 9, Seasons.AUTUMN),
                new Months("Октябрь", 10, Seasons.AUTUMN),
                new Months("Ноябрь", 11, Seasons.AUTUMN),
                new Months("Декабрь", 12,Seasons.WINTER)
        );
    }
}
