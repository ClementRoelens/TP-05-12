package org.example.Classes;

public abstract class Building {
    private final int id;
    private static int count;
    protected String name;
    protected BuildingStyle style;
    protected int size;
    protected int trainingTime;
    protected int buildingTime;
    protected int structuralDamages;
    protected boolean hasRoof;
    protected boolean isDestroyed;



    protected Building(BuildingBuilder builder) {
        this.id = count++;
        this.style = builder.getStyle();
        this.size = builder.getSize();
        this.trainingTime = builder.getTrainingTime();
        this.buildingTime = builder.getBuildingTime();
        this.structuralDamages = 0;
        this.hasRoof = builder.isHasRoof();
    }



    private int getId() {
        return id;
    }

    private static int getCount() {
        return count;
    }

    private String getName() {
        return name;
    }

    private BuildingStyle getStyle() {
        return style;
    }

    private int getSize() {
        return size;
    }

    private int getTrainingTime() {
        return trainingTime;
    }

    private int getBuildingTime() {
        return buildingTime;
    }

    private int getStructuralDamages() {
        return structuralDamages;
    }

    private boolean isHasRoof() {
        return hasRoof;
    }




    public abstract Characters.Builder createCharacters();

    public final void takeDamages(int amount){
        if (!this.isDestroyed){
            if (amount > 0){
                this.structuralDamages += amount;
                System.out.printf("%s prend %d points de dommages structurels\n", this.name, amount);
                if (this.structuralDamages > 100){
                    this.isDestroyed = true;
                    System.out.printf("%s est détruit\n", this.name);
                }
            } else {
                System.out.println("Les dommages ne peuvent pas être négatifs");
            }
        } else {
            System.out.printf("%s est déjà détruit\n");
        }
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", style=" + style +
                ", size=" + size +
                ", trainingTime=" + trainingTime +
                ", buildingTime=" + buildingTime +
                ", structuralDamages=" + structuralDamages +
                ", hasRoof=" + hasRoof +
                '}';
    }
}
