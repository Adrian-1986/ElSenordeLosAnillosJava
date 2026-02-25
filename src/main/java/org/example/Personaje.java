package org.example;

public class Personaje {
    private String nombre;
    private int edad;
    private String arma;
    private String bando;

    public Personaje(String nombre, int edad, String arma, String bando) {
        this.nombre = nombre;
        this.edad = edad;
        this.arma = arma;
        this.bando = bando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getBando() {
        return bando;
    }

    public void setBando(String bando) {
        this.bando = bando;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Arma: " + arma);
        System.out.println("Bando: " + bando);
    }
}
