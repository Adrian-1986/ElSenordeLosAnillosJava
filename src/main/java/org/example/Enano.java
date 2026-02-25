package org.example;

public class Enano extends Personaje {
    private String clan;

    public Enano(String nombre, int edad, String arma, String bando, String clan) {
        super(nombre, edad, arma, bando);
        this.clan = clan;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Raza: Enano");
        super.imprimirDetalles();
        System.out.println("Clan: " + clan);
        System.out.println("-");
    }
}
