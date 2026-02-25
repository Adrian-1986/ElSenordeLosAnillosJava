package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();

        personajes.add(new Humano("Aragorn", 87, "Espada", "Bien", "Gondor"));
        personajes.add(new Humano("Boromir", 40, "Espada", "Bien", "Gondor"));
        personajes.add(new Humano("Eowyn", 24, "Espada", "Bien", "Rohan"));

        for (Personaje personaje : personajes) {
            personaje.imprimirDetalles();
        }
    }
}
