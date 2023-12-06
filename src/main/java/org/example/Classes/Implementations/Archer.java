package org.example.Classes.Implementations;

import org.example.Classes.Characters;

public class Archer extends Characters {
    protected Archer(Builder builder) {
        super(builder);
        Hide();
    }
    public void Hide(){
        System.out.println("L'archer se cache dans la fôret pour frapper de loin.");
    }
    public static class Builder extends Characters.Builder{
        @Override
        public Archer build(){
            return new Archer(this);
        }
    }
}
