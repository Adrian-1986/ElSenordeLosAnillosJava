package org.example;

public class Human extends Character {
    private String kingdom;

    public Human(String name, int age, String weapon, String side, String kingdom) {
        super(name, age, weapon, side);
        this.kingdom = kingdom;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    @Override
    public void printDetails() {
        System.out.println("Race: Human");
        super.printDetails();
        System.out.println("Kingdom: " + kingdom);
        System.out.println("-");
    }
}
