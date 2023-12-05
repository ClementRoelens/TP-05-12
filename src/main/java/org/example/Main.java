package org.example;

import org.example.Classes.Building;
import org.example.Classes.BuildingStyle;
import org.example.Classes.Implementations.Barracks;

public class Main {
    public static void main(String[] args) {

        Building test = new Barracks.Builder()
                .size(3)
                .buildingTime(30)
                .hasRoof(true)
                .style(BuildingStyle.ROCK)
                .trainingTime(10)
                .build();
        System.out.println(test);
    }
}