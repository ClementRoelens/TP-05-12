package org.example.Classes;

public class Health {

    int healthAmount;
    public Health(int healthAmount) {
        this.healthAmount = healthAmount;
    }

    @Override
    public String toString() {
        return "Health{" +
                "healthAmount=" + healthAmount +
                '}';
    }
}
