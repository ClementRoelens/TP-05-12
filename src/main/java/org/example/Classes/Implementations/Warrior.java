package org.example.Classes.Implementations;

import org.example.Classes.Characters;

public class Warrior extends Characters {
    protected Warrior(Builder builder) {
        super(builder);
    }

    public static class Builder extends Characters.Builder{
        @Override
        public Warrior build(){
            return new Warrior(this);
        }
    }


}
