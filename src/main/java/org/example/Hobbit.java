package org.example;

public class Hobbit extends Personaje {
    private String comarca;

    public Hobbit(String nombre, int edad, String arma, String bando, String comarca) {
        super(nombre, edad, arma, bando);
        this.comarca = comarca;
    }

    public String getComarca() {
        return comarca;
    }

    public void setComarca(String comarca) {
        this.comarca = comarca;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Raza: Hobbit");
        super.imprimirDetalles();
        System.out.println("Comarca: " + comarca);
        System.out.println("-");
    }
}
