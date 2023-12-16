package ru.mirea.task4;

enum Season {
    Spring(15), Summer(25), Autumn(10), Winter(0);

    private int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        switch (this) {
            case Summer:
                return "Warm season";
            default:
                return "Cold season";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.Summer;
        System.out.println("My favorite season: " + myFavoriteSeason);
        System.out.println("Average temperature: " + myFavoriteSeason.getAverageTemperature());
        System.out.println("Description: " + myFavoriteSeason.getDescription());

        System.out.println("Season information:");
        for (Season season : Season.values()) {
            System.out.println("Season: " + season);
            System.out.println("Average temperature: " + season.getAverageTemperature());
            System.out.println("Description: " + season.getDescription());
            System.out.println();
        }
    }
}