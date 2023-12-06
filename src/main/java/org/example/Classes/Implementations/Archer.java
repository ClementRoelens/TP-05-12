package org.example.Classes.Implementations;

import org.example.Classes.Characters;

public class Archer extends Characters {
    protected Archer(Builder builder) {
        super(builder);
        this.name = "L'archer";
        this.atkValue = 30;
    }

    public void hide() {
        if (this.isAlive){
            System.out.println("L'archer se cache dans la forêt pour frapper de loin");
        }
    }

    @Override
    public int makeDamages() {
        this.hide();
        return super.makeDamages();
    }

    public static class Builder extends Characters.Builder{
        @Override
        public Archer build(){
            return new Archer(this);
        }

    }
}
