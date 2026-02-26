package org.example;

public class Orc extends Character {
    private String tribe;

    public Orc(String name, int age, String weapon, String side, String tribe) {
        super(name, age, weapon, side);
        this.tribe = tribe;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    @Override
    public void printDetails() {
        System.out.println("Race: Orc");
        super.printDetails();
        System.out.println("Tribe: " + tribe);
        System.out.println("-");
    }
}
