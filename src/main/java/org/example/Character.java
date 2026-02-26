package org.example;

public class Character {
    private String name;
    private int age;
    private String weapon;
    private String side;

    public Character(String name, int age, String weapon, String side) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weapon: " + weapon);
        System.out.println("Side: " + side);
    }
}
