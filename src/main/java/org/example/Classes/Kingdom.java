package org.example.Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Kingdom {
    private static Kingdom instance = null;
    private static final Object lock = new Object();

    private List<Characters> characters = new ArrayList<>();
    private List<Building> buildings = new ArrayList<>();


    public List<Characters> getCharacters() {
        return characters;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public static Kingdom getInstance(){
        if (instance == null){
            synchronized (lock){
                return new Kingdom();
            }
        }
        return instance;
    }


    public List<Characters> addCharacters(Characters ...characters){
        this.characters.addAll(Arrays.asList(characters));
        return this.characters;
    }

    public List<Building> addBuildings(Building ...buildings){
        this.buildings.addAll(Arrays.asList(buildings));
        return this.buildings;
    }

    @Override
    public String toString() {
        return "Kingdom{" +
                "characters=" + characters +
                ", buildings=" + buildings +
                '}';
    }
}
