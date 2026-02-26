package org.example;

public class Elf extends Character {
    private String bosque;

    public Elf(String nombre, int edad, String arma, String bando, String bosque) {
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
