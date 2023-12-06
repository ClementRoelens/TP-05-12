package org.example.Classes;


public abstract class Characters {
    private int id;
    private static int count;
    protected String name;
    protected int atkValue;
    Health health;
    Mana mana;
    Armament armament;
    PhysicalSkill physicalSkill;
    MagicalSkill magicalSkill;
    Race race;
    protected boolean isAlive;


    protected Characters(Builder builder) {
        this.id = count++;
        this.health = builder.health;
        this.mana = builder.mana;
        this.armament = builder.armament;
        this.physicalSkill = builder.physicalSkill;
        this.magicalSkill = builder.magicalSkill;
        this.race = builder.race;
        this.isAlive = true;
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

    public void takeDamages(int amount) {
        if (amount > 0) {
            if (this.isAlive) {
                this.health.setHealthAmount(this.health.getHealthAmount() - amount);
                System.out.printf("%s %d prend %d points de dégâts\n", this.name, this.id, amount);
                if (this.health.getHealthAmount() <= 0) {
                    System.out.printf("%s %d est mort\n", this.name, this.id);
                    this.isAlive = false;
                }
            } else {
                System.out.printf("%s %d est déjà mort !\n", this.name, this.id);
            }
        }
    }

    public int makeDamages() {
        if (this.isAlive) {
            return this.atkValue;
        }
        System.out.println("Un personnage mort ne peut pas attaquer !");
        return 0;
    }

    public abstract static class Builder {
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

        public abstract Characters build();
    }


}
