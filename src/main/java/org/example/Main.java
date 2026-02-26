package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> personajes = new ArrayList<>();

        personajes.add(new Human("Aragorn", 87, "Espada", "Bien", "Gondor"));
        personajes.add(new Human("Boromir", 40, "Espada", "Bien", "Gondor"));
        personajes.add(new Human("Eowyn", 24, "Espada", "Bien", "Rohan"));

        personajes.add(new Elf("Legolas", 2931, "Arco", "Bien", "Bosque Negro"));
        personajes.add(new Elf("Galadriel", 8372, "Magia", "Bien", "Lothlorien"));
        personajes.add(new Elf("Elrond", 6518, "Espada", "Bien", "Rivendel"));

        personajes.add(new Dwarf("Gimli", 139, "Hacha", "Bien", "Erebor"));
        personajes.add(new Dwarf("Thorin", 195, "Espada", "Bien", "Erebor"));
        personajes.add(new Dwarf("Dain", 252, "Hacha", "Bien", "Colinas de Hierro"));

        personajes.add(new Hobbit("Frodo", 50, "Daga", "Bien", "La Comarca"));
        personajes.add(new Hobbit("Sam", 38, "Daga", "Bien", "La Comarca"));
        personajes.add(new Hobbit("Pippin", 29, "Daga", "Bien", "La Comarca"));

        personajes.add(new Orc("Azog", 200, "Maza", "Mal", "Mordor"));
        personajes.add(new Orc("Ugluk", 60, "Espada", "Mal", "Isengard"));
        personajes.add(new Orc("Lurtz", 30, "Espada", "Mal", "Isengard"));

        for (Character personaje : personajes) {
            personaje.imprimirDetalles();
        }
    }
}
