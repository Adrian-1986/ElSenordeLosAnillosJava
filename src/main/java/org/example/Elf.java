package org.example;

public class Elf extends Character {
    private String forest;

    public Elf(String name, int age, String weapon, String side, String forest) {
        super(name, age, weapon, side);
        this.forest = forest;
    }

    public String getForest() {
        return forest;
    }

    public void setForest(String forest) {
        this.forest = forest;
    }

    @Override
    public void printDetails() {
        System.out.println("Race: Elf");
        super.printDetails();
        System.out.println("Forest: " + forest);
        System.out.println("-");
    }
}
