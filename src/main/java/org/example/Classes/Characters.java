package org.example.Classes;


public class Characters {

    Health health;
    Mana mana;
    Armament armament;
    PhysicalSkill physicalSkill;
    MagicalSkill magicalSkill;
    Race race;


    protected Characters(Builder builder) {
        this.health = builder.health;
        this.mana = builder.mana;
        this.armament = builder.armament;
        this.physicalSkill = builder.physicalSkill;
        this.magicalSkill = builder.magicalSkill;
        this.race = builder.race;
    }

    public static class Builder {
        private Health health;
        private Mana mana;
        private Armament armament;
        private PhysicalSkill physicalSkill;
        private MagicalSkill magicalSkill;
        private Race race;

        public Builder health(Health health) {
            this.health = health;
            return this;
        }

        public Builder mana(Mana mana) {
            this.mana = mana;
            return this;
        }

        public Builder armament(Armament armament) {
            this.armament = armament;
            return this;
        }

        public Builder physicalSkill(PhysicalSkill physicalSkill) {
            this.physicalSkill = physicalSkill;
            return this;
        }

        public Builder magicalSkill(MagicalSkill magicalSkill) {
            this.magicalSkill = magicalSkill;
            return this;
        }

        public Builder race(Race race) {
            this.race = race;
            return this;
        }

        public Characters build() {
            // Vous devriez appeler le constructeur privé de Characters ici
            return new Characters(this);
        }
    }

    @Override
    public String toString() {
        return "Characters{" +
                "health=" + health +
                ", mana=" + mana +
                ", armament=" + armament +
                ", physicalSkill=" + physicalSkill +
                ", magicalSkill=" + magicalSkill +
                ", race=" + race +
                '}';
    }
}
