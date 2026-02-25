package org.example;

public class Humano extends Personaje {
    private String reino;

    public Humano(String nombre, int edad, String arma, String bando, String reino) {
        super(nombre, edad, arma, bando);
        this.reino = reino;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Raza: Humano");
        super.imprimirDetalles();
        System.out.println("Reino: " + reino);
        System.out.println("-");
    }
}
