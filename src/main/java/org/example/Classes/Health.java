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

    public int getHealthAmount() {
        return healthAmount;
    }

    public void setHealthAmount(int healthAmount) {
        this.healthAmount = healthAmount;
    }
}
