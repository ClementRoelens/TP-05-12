package org.example.Classes.Implementations;

import org.example.Classes.Characters;

public class Warrior extends Characters {
    protected Warrior(Builder builder) {
        super(builder);
        Charge();
    }

    public void Charge(){
        System.out.println("Le guerrier charge avec son arme.");
    }

    public static class Builder extends Characters.Builder{
        @Override
        public Warrior build(){
            return new Warrior(this);
        }
    }


}
