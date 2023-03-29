package Seasons;

public class Months {
    private final String name;
    private final int monthNum;
    private final Seasons seasons;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ",monthNum=" + monthNum +
                ",seasons=" + seasons +
                '}';
    }
    public Months(String name, int monthNum, Seasons seasons) {
        this.name = name;
        this.monthNum = monthNum;
        this.seasons = seasons;
    }
    public String getName() {
        return name;
    }
    public int getMonthNum() {
        return monthNum;
    }
    public Seasons getSeasons() {
        return seasons;
    }
}
