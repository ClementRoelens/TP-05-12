package org.example.Classes.Implementations;

import org.example.Classes.Characters;

public class Warrior extends Characters {
    protected Warrior(Builder builder) {
        super(builder);
        this.name = "Le guerrier";
        this.atkValue = 100;
    }

    public void charge() {
        if (this.isAlive){
            System.out.println("Le guerrier charge avec son arme");
        }
    }

    @Override
    public int makeDamages(){
        this.charge();
        return super.makeDamages();
    }
    public static class Builder extends Characters.Builder{
        @Override
        public Warrior build(){
            return new Warrior(this);
        }

    }


}
