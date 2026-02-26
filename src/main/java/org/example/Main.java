package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();

        characters.add(new Human("Aragorn", 87, "Sword", "Good", "Gondor"));
        characters.add(new Human("Boromir", 40, "Sword", "Good", "Gondor"));
        characters.add(new Human("Eowyn", 24, "Sword", "Good", "Rohan"));

        characters.add(new Elf("Legolas", 2931, "Bow", "Good", "Mirkwood"));
        characters.add(new Elf("Galadriel", 8372, "Magic", "Good", "Lothlorien"));
        characters.add(new Elf("Elrond", 6518, "Sword", "Good", "Rivendell"));

        characters.add(new Dwarf("Gimli", 139, "Axe", "Good", "Erebor"));
        characters.add(new Dwarf("Thorin", 195, "Sword", "Good", "Erebor"));
        characters.add(new Dwarf("Dain", 252, "Axe", "Good", "Iron Hills"));

        characters.add(new Hobbit("Frodo", 50, "Dagger", "Good", "The Shire"));
        characters.add(new Hobbit("Sam", 38, "Dagger", "Good", "The Shire"));
        characters.add(new Hobbit("Pippin", 29, "Dagger", "Good", "The Shire"));

        characters.add(new Orc("Azog", 200, "Mace", "Evil", "Mordor"));
        characters.add(new Orc("Ugluk", 60, "Sword", "Evil", "Isengard"));
        characters.add(new Orc("Lurtz", 30, "Sword", "Evil", "Isengard"));

        for (Character character : characters) {
            character.printDetails();
        }
    }
}
