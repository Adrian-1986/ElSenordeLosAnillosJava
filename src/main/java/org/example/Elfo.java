package org.example;

public class Elfo extends Personaje {
    private String bosque;

    public Elfo(String nombre, int edad, String arma, String bando, String bosque) {
        super(nombre, edad, arma, bando);
        this.bosque = bosque;
    }

    public String getBosque() {
        return bosque;
    }

    public void setBosque(String bosque) {
        this.bosque = bosque;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Raza: Elfo");
        super.imprimirDetalles();
        System.out.println("Bosque: " + bosque);
        System.out.println("-");
    }
}
