package org.example.Classes.Implementations;

import org.example.Classes.*;

public class Archery extends Building {
    private Archery(BuildingBuilder builder){
        super(builder);
        this.name = "Archerie";
    }

    public void archeryBurns(){
        System.out.println("Oups, l'archerie a brûlé");
        this.isDestroyed = true;
    }

    @Override
    public Archer.Builder createCharacters() {
        if (!this.isDestroyed){
            return new Archer.Builder();
        }
        System.out.println("L'archerie a été détruire, vous ne pouvez plus créer d'archer");
        return null;
    }

    public static class Builder extends BuildingBuilder{

        @Override
        public Archery build() {
            return new Archery(this);
        }
    }
}
