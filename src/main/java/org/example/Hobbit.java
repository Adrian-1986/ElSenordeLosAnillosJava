package org.example;

public class Hobbit extends Character {
    private String shire;

    public Hobbit(String name, int age, String weapon, String side, String shire) {
        super(name, age, weapon, side);
        this.shire = shire;
    }

    public String getShire() {
        return shire;
    }

    public void setShire(String shire) {
        this.shire = shire;
    }

    @Override
    public void printDetails() {
        System.out.println("Race: Hobbit");
        super.printDetails();
        System.out.println("Shire: " + shire);
        System.out.println("-");
    }
}
