package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();

        personajes.add(new Humano("Aragorn", 87, "Espada", "Bien", "Gondor"));
        personajes.add(new Humano("Boromir", 40, "Espada", "Bien", "Gondor"));
        personajes.add(new Humano("Eowyn", 24, "Espada", "Bien", "Rohan"));

        personajes.add(new Elfo("Legolas", 2931, "Arco", "Bien", "Bosque Negro"));
        personajes.add(new Elfo("Galadriel", 8372, "Magia", "Bien", "Lothlorien"));
        personajes.add(new Elfo("Elrond", 6518, "Espada", "Bien", "Rivendel"));

        personajes.add(new Enano("Gimli", 139, "Hacha", "Bien", "Erebor"));
        personajes.add(new Enano("Thorin", 195, "Espada", "Bien", "Erebor"));
        personajes.add(new Enano("Dain", 252, "Hacha", "Bien", "Colinas de Hierro"));

        for (Personaje personaje : personajes) {
            personaje.imprimirDetalles();
        }
    }
}
