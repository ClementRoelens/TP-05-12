package org.example.Classes.Implementations;

import org.example.Classes.Building;
import org.example.Classes.BuildingBuilder;

public class Barracks extends Building {
    private Barracks(BuildingBuilder builder) {
        super(builder);
        this.name = "Caserne";
    }

    public static class Builder extends BuildingBuilder {

        @Override
        public Barracks build() {
            return new Barracks(this);
        }

    }
}
