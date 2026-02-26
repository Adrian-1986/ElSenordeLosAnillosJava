package org.example;

public class Orc extends Character {
    private String tribu;

    public Orc(String nombre, int edad, String arma, String bando, String tribu) {
        super(nombre, edad, arma, bando);
        this.tribu = tribu;
    }

    public String getTribu() {
        return tribu;
    }

    public void setTribu(String tribu) {
        this.tribu = tribu;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Raza: Orco");
        super.imprimirDetalles();
        System.out.println("Tribu: " + tribu);
        System.out.println("-");
    }
}
