package org.example.Classes.Implementations;

import org.example.Classes.Building;
import org.example.Classes.BuildingBuilder;
import org.example.Classes.Characters;

public class Archery extends Building {
    private Archery(BuildingBuilder builder){
        super(builder);
        this.name = "Fôret de Sherwood";
    }
    @Override
    public Archer.Builder createCharacters() {
        return new Archer.Builder();
    }

    public static class Builder extends BuildingBuilder{

        @Override
        public Archery build() {
            return new Archery(this);
        }
    }
}
