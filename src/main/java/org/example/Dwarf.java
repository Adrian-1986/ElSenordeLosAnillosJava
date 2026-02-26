package org.example;

public class Dwarf extends Character {
    private String clan;

    public Dwarf(String name, int age, String weapon, String side, String clan) {
        super(name, age, weapon, side);
        this.clan = clan;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    @Override
    public void printDetails() {
        System.out.println("Race: Dwarf");
        super.printDetails();
        System.out.println("Clan: " + clan);
        System.out.println("-");
    }
}
